package com.sparta.ac.display;

import java.util.Arrays;

public abstract class DisplayOutput {

    public static void welcomeMessage() {
        System.out.println("  ASHTON'S MEGA-SORTER MANAGER 3000\n" +
                "'For all your household sorting needs'\n" +
                "");
    }

    public static void displayUnsortedArray(int[] array) {
        System.out.println("\nYour very own, randomly generated, unsorted array:\n" +
                Arrays.toString(array) +
                "\nDon't spend it all at once." +
                "");
    }

    public static void displaySortMethod(String method){
        System.out.println("\nThe sort method you used is: " + method + "\n" +
                "Great choice!\n" +
                "");
    }
    public static void displayResults(int[] result) {
        System.out.println("Your beautiful, shiny, amazingly brilliant, sorted array: \n" +
                Arrays.toString(result) + "\n" +
                "siiiiiiiiick\n" +
                "");
    }

    public static void displayTimer(long time) {
        System.out.println("... and look, it only took " + time + " nanoseconds.... speedy.\n" +
                "");
    }

    public static void goodbyeMessage() {
        System.out.println("Thank you for sorting with us. We hope you have a pleasant day :)");
    }

}
