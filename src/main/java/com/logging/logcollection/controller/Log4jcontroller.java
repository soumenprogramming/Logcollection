package com.logging.logcollection.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log4jcontroller {
    private static final Logger log = Logger.getLogger(Log4jcontroller.class);
    @GetMapping("/log")
    public String log() {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        log.fatal("This is a fatal message");
        log.trace("This is a trace message");
        return "Log message has been sent!";
    }
}