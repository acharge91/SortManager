package com.sparta.ac.display;

import java.util.Scanner;

public class DisplayInput {
    public static int getUserSortChoice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Select which sorter you wish to use:
                1 - Bubble Sort
                2 - Merge Sort
                3 - Binary Sort
                E - To exit
                Enter choice:\s""");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int getUserArraySize() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the size of array you wish to generate, up to 100: ");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int getRootNode() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number to be the root node: ");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int[] getMergeArrays() {
        Scanner userInputOne = new Scanner(System.in);
        Scanner userInputTwo = new Scanner(System.in);

        System.out.println("Enter the size of the first array you wish to generate, up to 50: ");
        int inputOne = Integer.parseInt(userInputOne.nextLine());
        System.out.println("Enter the size of the first array you wish to generate, up to 50: ");
        int inputTwo = Integer.parseInt(userInputTwo.nextLine());
        int [] userInputs = {inputOne, inputTwo};
        return userInputs;
    }
}
