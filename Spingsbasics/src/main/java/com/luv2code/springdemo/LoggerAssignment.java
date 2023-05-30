package com.luv2code.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerAssignment {
    private static final Logger logger = LoggerFactory.getLogger(LoggerAssignment.class);

    public static void main(String[] args) {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");


    }
}