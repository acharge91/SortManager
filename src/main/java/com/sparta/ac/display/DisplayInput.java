package com.sparta.ac.display;

import java.util.Scanner;

public abstract class DisplayInput {

    public static int getUserSortChoice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Select which sorter you wish to use:
                1 - Bubble Sort
                2 - Insertion Sort
                3 - Binary Sort
                9 - To exit
                Enter choice:\s""");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int getUserArraySize() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the size of array you wish to generate, up to 100: ");
        return Integer.parseInt(userInput.nextLine());
    }

}
