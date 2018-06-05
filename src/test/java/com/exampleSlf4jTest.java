package com;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class exampleSlf4jTest {

    private static final Logger log = LoggerFactory.getLogger(exampleSlf4jTest.class);

    @Test
    public void testLoggingWithLsftjSimple() {
        log.warn("This is a warning message from test source tree");
    }
}
