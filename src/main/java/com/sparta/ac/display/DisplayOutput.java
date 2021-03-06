package com.sparta.ac.display;

import java.util.Arrays;

public abstract class DisplayOutput {

    public static void welcomeMessage() {
        System.out.println("  ***********************************\n" +
                "  *ASHTON'S MEGA SORT MANAGER 3000*\n" +
                "  ***********************************\n" +
                "'For all your household sorting needs'\n" +
                "       █▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█\n" +
                "       █░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█\n" +
                "       █░░║║║╠─║─║─║║║║║╠─░░█\n" +
                "       █░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█\n" +
                "       █▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█\n" +
                "\n" +
                "        First things first.");
    }

    public static void displayUnsortedArray(int[] array) {
        System.out.println("\nYour very own, randomly generated, unsorted array:\n" +
                Arrays.toString(array) +
                "\nDon't spend it all at once.");
    }

    public static void displaySortMethod(String method) {
        System.out.println("\nThe sort method you are using is: " + method  +
                "   (Great choice!)\n");
    }

    public static void displayTwoSortingMethods(String methodOne, String methodTwo) {
        System.out.println("\nOk then " + methodOne  + " Vs. " + methodTwo +
                "\n" +
                "Let the battle commence!\n");
    }

    public static void displayResults(int[] result) {
        System.out.println("Sorting... Gimme a sec...\n" +
                "Your beautiful, shiny, amazingly brilliant, sorted array: \n" +
                Arrays.toString(result) + "\n" +
                "siiiiiiiiick\n" +
                "");
    }

    public static void displayTwoResults(String firstSorter, int[] resultOne, long timeOne, String secondSorter, int[] resultTwo, long timeTwo) {
        System.out.println("Sorting... Gimme a sec...\n" +
                "\n"+
                "The results are in.\n" +
                "\n" +
                firstSorter + ": " + Arrays.toString(resultOne) +
                "\nAnd it did it in " + timeOne + " nanoseconds\n" +
                "\n" +
                secondSorter + ": " + Arrays.toString(resultTwo) +
                "\nAnd that did it in " + timeTwo + " nanoseconds\n");

    }

    public static void displayWinner(String winningSorter, long wonByTime) {
        System.out.println("We have a winner!!!!\n" +
                winningSorter + " takes it by a whopping " + wonByTime + " nanoseconds\n" +
                "WOOOHOOOOOO");
    }

    public static void displayTimer(long time) {
        System.out.println("... and look, it only took " + time + " nanoseconds.\n" +
                "───▄▄▄\n" +
                "─▄▀░▄░▀▄\n" +
                "─█░█▄▀░█\n" +
                "─█░▀▄▄▀█▄█▄▀\n" +
                "▄▄█▄▄▄▄███▀ ... speedy\n");
    }

    public static void goodbyeMessage() {
        System.out.println("Thank you for sorting with us. We hope you have a pleasant day :)");
    }

}
