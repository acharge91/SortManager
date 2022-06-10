package com.sparta.ac.start;

import com.sparta.ac.logging.LogConfig;
import com.sparta.ac.start.SortLoader;

import java.util.logging.Logger;

public class App 
{
    private static final Logger logger = Logger.getLogger("my logger");
    public static void main( String[] args ){

        LogConfig.setLogConfig(logger);
        SortLoader.runSortLoader();
    }
}
