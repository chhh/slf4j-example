package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {

    private static final Logger log = LoggerFactory.getLogger(Slf4jExample.class);

    public static void main(String[] args) {
        log.info("This is an info message from main source tree");
        log.info("These messages are now printed by 'logback-classic' logger " +
                "implementation using its default configuration");
    }
}
