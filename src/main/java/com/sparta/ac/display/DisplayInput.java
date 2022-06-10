package com.sparta.ac.display;

import java.util.Scanner;

public abstract class DisplayInput {

    public static int getUserSortChoice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Select which sorter you wish to use:
                
                1 - Bubble Sort ---- (Sorts arrays using iterations of an array until all elements are in order)
                2 - Insertion Sort - (Uses recursion to swap elements until all elements are in order)
                3 - Binary Tree Sort ---- (Sorts elements into a binary tree and traverses the tree to order them)
                9 - To exit -------- (We will be sad to see you go)
                
                Enter choice:\s""");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int getUserArraySize() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Now enter the size of array you wish to generate. Don't be shy: ");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int getSortAnotherChoice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Would you like to compare this method with another?\n" +
                "1 - YEEEES go for it\n" +
                "2 - Are you mad, NO!");

        return Integer.parseInt(userInput.nextLine());
    }

    public static int getComparisonSorter(String currentChoice) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Ooooo spicy. Ok lets give it a go.\n" +
                "\nWhich sorter would you like to compare " + currentChoice + " to:");
        if (currentChoice.equals("Binary tree sort")){
            System.out.println("1 - Bubble sort\n" +
                    "Or\n" +
                    "2 - Insertion Sort");
        } else if (currentChoice.equals("Bubble sort")) {
            System.out.println("2 - Insertion sort\n" +
                    "Or\n" +
                    "3 - Binary Tree Sort");
        } else {
            System.out.println("1 - Bubble Sort\n" +
                    "Or\n" +
                    "3 - Binary sort");
        }
        return Integer.parseInt(userInput.nextLine());
    }
}
