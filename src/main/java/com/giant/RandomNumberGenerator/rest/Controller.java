package com.giant.RandomNumberGenerator.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/me")
    public String getMe() {

        int number = new Random().nextInt(1000001);
        logger.info("I am " + number + ".");
        logger.debug("I am executed.");
        return "I am " + number + ".";
    }
}
