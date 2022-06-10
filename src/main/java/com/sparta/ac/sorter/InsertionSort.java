package com.sparta.ac.sorter;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSort implements Sorter {
    private static Logger logger = Logger.getLogger("Binary sort logger");
    private static long timer;
    public String getName(){ return "Insertion sort"; }

    public static int[] getSortedArray(int[] arrayToSort) {
        long startTime = System.nanoTime();
        insertionSort(arrayToSort, arrayToSort.length);
        long endTime = System.nanoTime();
        timer = (endTime - startTime);
        logger.log(Level.INFO, "Start timer before calling InsertionSort method with arrayToSort: " + Arrays.toString(arrayToSort) + ". Start time: " + startTime + ". Call method. Stop time: " + endTime + ". produce total time taken: " + timer + " and assign value to timer field.");

        return arrayToSort;
    }
    static void insertionSort(int[] arrayToSort, int arrayLength) {
        if (arrayLength <= 1) {
            return;
        }

        insertionSort(arrayToSort, arrayLength - 1);

        int lastElement = arrayToSort[arrayLength-1];
        int lastElementIndex = arrayLength-2;

        while (lastElementIndex >= 0 && arrayToSort[lastElementIndex] > lastElement) {
            arrayToSort[lastElementIndex+1] = arrayToSort[lastElementIndex];
            lastElementIndex--;
        }
        arrayToSort[lastElementIndex+1] = lastElement;
    }

    public long getTimer() {
        logger.log(Level.INFO, "Return timer field: " + timer);
        return timer;
    }

    @Override
    public int[] startSort(int[] arrayToSort) {
        logger.log(Level.INFO, "Received array to sort: " + Arrays.toString(arrayToSort) + ". Call getSortedArray with array.");
        return getSortedArray(arrayToSort);
    }
}
