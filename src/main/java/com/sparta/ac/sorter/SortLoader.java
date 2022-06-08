package com.sparta.ac.sorter;

import com.sparta.ac.binarytree.BinaryTree;
import com.sparta.ac.binarytree.BinaryTreeManager;
import com.sparta.ac.bubblesort.BubbleSort;
import com.sparta.ac.display.DisplayInput;
import com.sparta.ac.display.DisplayOutput;
import com.sparta.ac.mergearray.MergeArray;

public class SortLoader {

    public static void userChoice() {
        int userInput = DisplayInput.getUserSortChoice();
        SortFactory.userChoice(userInput);
    }

    public static int[] getArrayFromUser(){
        int arraySize = DisplayInput.getUserArraySize();
        int [] randomArray = RandomArrayGenerator.arrayGenerator(arraySize);
        return randomArray;
    }

    public static void bubbleSortLoader(){
        int[] arrayToSort = SortLoader.getArrayFromUser();
        int[] sortedArray = BubbleSort.getBubbleSortOfArray(arrayToSort);
        DisplayOutput.displayResults(sortedArray);
    }

    public static void mergeArrayLoader(){
        int[] arrayOneToSort = getArrayFromUser();
        int[] arrayTwoToSort = getArrayFromUser();
        MergeArray mergedArray = new MergeArray();
        mergedArray.setArrayOne(arrayOneToSort);
        mergedArray.setArrayTwo(arrayTwoToSort);
        int[] sortedArray = mergedArray.getMergedArray();
        DisplayOutput.displayResults(sortedArray);
    }

    public static void binarySortLoader(){
        int rootNode = DisplayInput.getRootNode();
        int[] arrayToSort = getArrayFromUser();
        BinaryTreeManager newBinaryTree = new BinaryTreeManager(rootNode);
        newBinaryTree.addElements(arrayToSort);
        int[] sortedArray = newBinaryTree.getSortedTreeAsc();
        DisplayOutput.displayResults(sortedArray);
    }
}
