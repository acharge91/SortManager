package com.sparta.ac.display;

import java.util.Arrays;

public class DisplayOutput {

    public static void displayUnsortedArray(int[] array) {
        System.out.println("Your randomly generated, unsorted array:\n" +
                Arrays.toString(array));
    }

    public static void displaySortMethod(String method){
        System.out.println("The sort method used is: " + method);
    }
    public static void displayResults(int[] result) {
        System.out.println("Your sorted array: " + Arrays.toString(result));
    }

    public static void mergeExplaination() {
        System.out.println("Merge sort takes 2 arrays and merges them into one sorted array.\n" +
                "Please select 2 array lengths.");
    }

}
