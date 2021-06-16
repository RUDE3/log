package com.example.log.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/index")
    String index(){
        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.info("This is a info message");
        logger.warn("This is a warn message");
        logger.error("This is a error message");
        return "index";
    }
}
