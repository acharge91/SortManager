package com.sparta.ac.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] getBubbleSortOfArray(int[] numArray) {
        for (int number : numArray) {
            for (int y = 0; y < numArray.length - 1; y++) {
                if (numArray[y] > numArray[y+1]) {
                    numArray[y] = (numArray[y] + numArray[y+1]) - (numArray[y+1] = numArray[y]);
                }
            }
        }
        return numArray;
    }
}
