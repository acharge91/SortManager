package com.sparta.ac.sorter;

public class BubbleSort implements Sorter {

    private static long timer;

    public String getName(){ return "Bubble sort"; }

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
        return numArray;
    }

    public long getTimer(){
        return timer;
    }
    @Override
    public int[] startSort(int[] arrayToSort) {
        return getBubbleSortOfArray(arrayToSort);
    }
}
