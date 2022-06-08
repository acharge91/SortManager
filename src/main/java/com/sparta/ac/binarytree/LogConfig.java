package com.sparta.ac.binarytree;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogConfig {
    public static void setLogConfig(Logger logger) {
        try {
            Handler fileHandler = new FileHandler("src/main/java/com/sparta/ac/binarytree/myLog.log");
            logger.addHandler(fileHandler);
            fileHandler.setFormatter(new CustomFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.setLevel(Level.INFO);
    }
}
