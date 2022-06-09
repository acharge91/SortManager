package com.sparta.ac;

import com.sparta.ac.logging.LogConfig;
import com.sparta.ac.start.SortLoader;

import java.util.logging.Logger;

public class App 
{
    private static Logger logger = Logger.getLogger("my logger");
    public static void main( String[] args ){
        LogConfig.setLogConfig(logger);
        SortLoader.runSortLoader();
    }
}
