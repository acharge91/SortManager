package com.sparta.ac.display;

import java.util.Scanner;

public class DisplayInput {
    public static int getUserSortChoice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Select which sorter you wish to use:\n" +
                "1 - Bubble Sort\n" +
                "2 - Merge Sort\n" +
                "3 - Binary Sort\n" +
                "Enter choice: ");
        int input = Integer.parseInt(userInput.nextLine());
        return input;
    }

    public static int getUserArraySize() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the size of array you wish to generate, up to 100: ");
        int input = Integer.parseInt(userInput.nextLine());
        return input;
    }

    public static int getRootNode() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number to be the root node: ");
        int input = Integer.parseInt(userInput.nextLine());
        return input;
    }
}
