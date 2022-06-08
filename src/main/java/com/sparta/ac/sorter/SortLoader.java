package com.sparta.ac.sorter;

import com.sparta.ac.binarytree.BinaryTree;
import com.sparta.ac.binarytree.BinaryTreeManager;
import com.sparta.ac.bubblesort.BubbleSort;
import com.sparta.ac.display.DisplayInput;
import com.sparta.ac.display.DisplayOutput;
import com.sparta.ac.mergearray.MergeArray;

public class SortLoader {

    public static void runSortLoader(){
        int userInput = DisplayInput.getUserSortChoice();
        while (userInput != 'e') {
            SortFactory.userChoice(userInput);
            userInput = DisplayInput.getUserSortChoice();
        }
    }

    public static int[] getArrayFromUser(){
        int arraySize = DisplayInput.getUserArraySize();
        int [] randomArray = RandomArrayGenerator.arrayGenerator(arraySize);
        return randomArray;
    }

    public static void bubbleSortLoader(){
        int[] arrayToSort = SortLoader.getArrayFromUser();
        DisplayOutput.displayUnsortedArray(arrayToSort);
        DisplayOutput.displaySortMethod("Bubble Sort");
        int[] sortedArray = BubbleSort.getBubbleSortOfArray(arrayToSort);
        DisplayOutput.displayResults(sortedArray);
    }

    public static void mergeArrayLoader(){
        DisplayOutput.mergeExplaination();
        int[] arrayOneToSort = getArrayFromUser();
        int[] arrayTwoToSort = getArrayFromUser();
        DisplayOutput.displayUnsortedArray(arrayOneToSort);
        DisplayOutput.displayUnsortedArray(arrayTwoToSort);
        DisplayOutput.displaySortMethod("Merge Sort");
        MergeArray mergedArray = new MergeArray();
        mergedArray.setArrayOne(arrayOneToSort);
        mergedArray.setArrayTwo(arrayTwoToSort);
        int[] sortedArray = mergedArray.getMergedArray();
        DisplayOutput.displayResults(sortedArray);
    }

    public static void binarySortLoader(){
        int rootNode = DisplayInput.getRootNode();
        int[] arrayToSort = getArrayFromUser();
        DisplayOutput.displayUnsortedArray(arrayToSort);
        BinaryTreeManager newBinaryTree = new BinaryTreeManager(rootNode);
        newBinaryTree.addElements(arrayToSort);
        int[] sortedArray = newBinaryTree.getSortedTreeAsc();
        DisplayOutput.displayResults(sortedArray);
    }
}
