package com.sparta.ac.start;

import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.sorter.BubbleSort;
import com.sparta.ac.sorter.InsertionSort;
import com.sparta.ac.sorter.Sorter;
import com.sparta.ac.sorter.binarytree.BinaryTree;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SortFactory {
    private static final Logger logger = Logger.getLogger("SortFactory logger");
    public static Sorter userChoice(int userChoice, int firstElementOfArray) throws InvalidSelectionException{
        logger.log(Level.INFO, "Received userChoice: " + userChoice + " to run switch case statement. Received  first element of random array: " + firstElementOfArray);
        return switch (userChoice) {
            case 1 -> new BubbleSort();
            case 2 -> new InsertionSort();
            case 3 -> new BinaryTree(firstElementOfArray);
            default -> throw new InvalidSelectionException("That is not a valid choice.");
        };
    }
}
