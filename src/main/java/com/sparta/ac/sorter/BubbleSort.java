package com.sparta.ac.sorter;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort implements Sorter {

    private static Logger logger = Logger.getLogger("Bubble sort logger");
    private static long timer;

    public String getName(){
        logger.log(Level.INFO, "Returning string sorter name: Bubble sort.");
        return "Bubble sort";
    }

    public static int[] getBubbleSortOfArray(int[] numArray) {
        long startTime = System.nanoTime();
        for (int number : numArray) {
            for (int y = 0; y < numArray.length - 1; y++) {
                if (numArray[y] > numArray[y+1]) {
                    numArray[y] = (numArray[y] + numArray[y+1]) - (numArray[y+1] = numArray[y]);
                }
            }
        }
        long endTime = System.nanoTime();
        timer = (endTime - startTime);
        logger.log(Level.INFO, "Return timer field: " + timer);
        return numArray;
    }

    public long getTimer(){
        return timer;
    }
    @Override
    public int[] startSort(int[] arrayToSort) {
        logger.log(Level.INFO, "Received array to sort: " + Arrays.toString(arrayToSort) + ". Call getBubbleSortOfArray with array.");
        return getBubbleSortOfArray(arrayToSort);
    }
}
