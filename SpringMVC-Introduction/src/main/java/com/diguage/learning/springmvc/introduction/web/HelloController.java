package com.diguage.learning.springmvc.introduction.web;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;

/**
 * SpringMVC 示例
 * <p/>
 * Coder：D瓜哥，http://www.diguage.com/
 * <p/>
 * Date: 2014-08-01 21:08
 */
@Controller
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = {"/", "/hello"})
    public String hello() {
        log.debug("The {} method run", "hello");
        return "hello";
    }
}
