package com.giant.RandomNumberGenerator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@Controller
public class IAmAController {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/me")
    public String getMe(Model model) {

        int number = new Random().nextInt(1000001);
        logger.info("I am " + number + ".");
        logger.debug("I am executed.");

        model.addAttribute("randomNumber", "I am " + number + ".");

        return "number";
    }
}
