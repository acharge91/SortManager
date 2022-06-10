package com.sparta.ac.display;

import java.util.Scanner;

public abstract class DisplayInput {

    public static int getUserSortChoice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Select which sorter you wish to use:
                
                1 - Bubble Sort ---- (Sorts arrays using iterations of an array until all elements are in order)
                2 - Insertion Sort - (Uses recursion to swap elements until all elements are in order)
                3 - Binary Sort ---- (Sorts elements into a binary tree and traverses the tree to order them)
                9 - To exit -------- (We will be sad to see you go)
                
                Enter choice:\s""");
        return Integer.parseInt(userInput.nextLine());
    }

    public static int getUserArraySize() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Now enter the size of array you wish to generate. Don't be shy: ");
        return Integer.parseInt(userInput.nextLine());
    }

}
