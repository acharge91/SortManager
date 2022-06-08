package com.sparta.ac;

import com.sparta.ac.binarytree.BinaryTreeManager;
import com.sparta.ac.binarytree.ChildNotFoundException;
import com.sparta.ac.binarytree.LogConfig;
import com.sparta.ac.mergearray.MergeArray;
import com.sparta.ac.sorter.SortFactory;
import com.sparta.ac.sorter.SortLoader;

import java.util.Arrays;
import java.util.logging.Logger;

public class App 
{
    private static Logger logger = Logger.getLogger("my logger");
    public static void main( String[] args ){
        SortLoader.runSortLoader();
    }
}
