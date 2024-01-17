package com.giant.RandomNumberGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RandomNumberGeneratorApplication {

	private static final Logger logger = LoggerFactory.getLogger(RandomNumberGeneratorApplication.class);

	public static void main(String[] args) {

		logger.info("Hello buddy, I am your number !");
		SpringApplication.run(RandomNumberGeneratorApplication.class, args);
	}

}
