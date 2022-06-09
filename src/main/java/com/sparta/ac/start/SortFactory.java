package com.sparta.ac.start;

import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.sorter.BubbleSort;
import com.sparta.ac.sorter.InsertionSort;
import com.sparta.ac.sorter.Sorter;
import com.sparta.ac.sorter.binarytree.BinaryTree;

public abstract class SortFactory {

    public static Sorter userChoice(int userChoice, int one) throws InvalidSelectionException{
        return switch (userChoice) {
            case 1 -> new BubbleSort();
            case 2 -> new InsertionSort();
            case 3 -> new BinaryTree(one);
            default -> throw new InvalidSelectionException("That is not a valid choice.");
        };
    }
}
