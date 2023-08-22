package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    static final Logger logger =
            LoggerFactory.getLogger(Main.class);

    public static boolean execute() {
        logger.info("Example action execured");
        logger.warn("Example action execured");
        logger.error("Example action execured");
        return true;
    }

    public static void main(String[] x) {
        execute();
        System.out.println("Hello world!");
    }
}