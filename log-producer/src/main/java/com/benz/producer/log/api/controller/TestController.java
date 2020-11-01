package com.benz.producer.log.api.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    final private static Logger logger =LogManager.getLogger(TestController.class);

    @GetMapping("/{name}")
    public void test(@PathVariable("name") String name)
    {
        logger.info(String.format("print log message %s as info",name));
        logger.error(String.format("print log message %s as error",name));
        logger.warn(String.format("print log message %s as warn",name));
    }
}
