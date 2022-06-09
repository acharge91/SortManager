package com.sparta.ac.sorter;

import java.util.Arrays;

public class InsertionSort implements Sorter {

    private static long timer;

    public String getName(){ return "Insertion sort"; }

    public static int[] getSortedArray(int[] arrayToSort) {
        long startTime = System.nanoTime();
        insertionSort(arrayToSort, arrayToSort.length);
        long endTime = System.nanoTime();
        timer = (endTime - startTime);
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
        return timer;
    }

    @Override
    public int[] startSort(int[] arrayToSort) {

        return getSortedArray(arrayToSort);
    }
}
