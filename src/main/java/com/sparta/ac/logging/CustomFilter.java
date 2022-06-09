package com.sparta.ac.logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        if (record.getMessage().equals("Warning")){
            return true;
        } else {
            return false;
        }
    }
}
