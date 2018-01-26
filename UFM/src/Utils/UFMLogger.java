package com.itdominator.ufm.Utils;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.io.IOException;


public class UFMLogger {
    private static UFMLogger ufmLogger = new UFMLogger();
    private Logger logger = Logger.getLogger(UFMLogger.class.getName());
    private boolean append = false;

    // Instance passer
    public static UFMLogger getInstance() { return ufmLogger; }

    // Init UFMLogger
    private UFMLogger() {
        try {
            FileHandler logFile = new FileHandler("ufm_error.log", append);
            logger.addHandler(logFile);
        } catch (IOException e) {
            insertToLog(Level.SEVERE, "Can not access error log file...", e);
            e.printStackTrace();
        }
    }

    public void insertToLog(Level severity, String message, Exception stackTrace) {
        logger.log(severity, message, stackTrace);
    }
}
