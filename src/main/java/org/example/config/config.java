package org.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class config {
    private static final Logger logger =
            LoggerFactory.getLogger(config.class);

    public void configLogger() {
        logger.info("Configuration logging message");
    }
}
