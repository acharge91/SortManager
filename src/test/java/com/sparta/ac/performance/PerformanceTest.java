package com.sparta.ac.performance;

import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.sorter.BubbleSort;
import com.sparta.ac.sorter.InsertionSort;
import com.sparta.ac.sorter.binarytree.BinaryTree;
import com.sparta.ac.start.RandomArrayGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PerformanceTest {

   private static int[] randomArrayToTest(int size){
       try {
           return RandomArrayGenerator.arrayGenerator(size);
       } catch (InvalidSelectionException e) {
           throw new RuntimeException(e);
       }
   }

    @Test
    @DisplayName("Test bubble sort with array length 50")
    void testBubbleSortWithArray50(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(50);
        System.out.println("----------------------------------------------\n" +
                "|Testing Bubble Sort with an array size of 50|\n" +
                "----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = BubbleSort.getBubbleSortOfArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 50")
    void testInsertionSortWithArray50(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(50);
        System.out.println("-------------------------------------------------\n" +
                "|Testing Insertion Sort with an array size of 50|\n" +
                "-------------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = InsertionSort.getSortedArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 50")
    void testBinarySortWithArray50(){
        BinaryTree testTree = new BinaryTree(30);
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(49);
        System.out.println("----------------------------------------------\n" +
                "|Testing Binary Sort with an array size of 50|\n" +
                "----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        testTree.addElements(testArray);
        int [] sortedArray = testTree.getSortedTreeAsc();
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test bubble sort with array length 100")
    void testBubbleSortWithArray100(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(100);
        System.out.println("-----------------------------------------------\n" +
                "|Testing Bubble Sort with an array size of 100|\n" +
                "-----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = BubbleSort.getBubbleSortOfArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 100")
    void testInsertionSortWithArray100(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(100);
        System.out.println("--------------------------------------------------\n" +
                "|Testing Insertion Sort with an array size of 100|\n" +
                "--------------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = InsertionSort.getSortedArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 100")
    void testBinarySortWithArray100(){
        BinaryTree testTree = new BinaryTree(30);
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(99);
        System.out.println("-----------------------------------------------\n" +
                "|Testing Binary Sort with an array size of 100|\n" +
                "-----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        testTree.addElements(testArray);
        int [] sortedArray = testTree.getSortedTreeAsc();
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test bubble sort with array length 200")
    void testBubbleSortWithArray200(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(200);
        System.out.println("-----------------------------------------------\n" +
                "|Testing Bubble Sort with an array size of 200|\n" +
                "-----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = BubbleSort.getBubbleSortOfArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 200")
    void testInsertionSortWithArray200(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(200);
        System.out.println("--------------------------------------------------\n" +
                "|Testing Insertion Sort with an array size of 200|\n" +
                "--------------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = InsertionSort.getSortedArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 200")
    void testBinarySortWithArray200(){
        BinaryTree testTree = new BinaryTree(30);
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(199);
        System.out.println("-----------------------------------------------\n" +
                "|Testing Binary Sort with an array size of 200|\n" +
                "-----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        testTree.addElements(testArray);
        int [] sortedArray = testTree.getSortedTreeAsc();
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test bubble sort with array length 500")
    void testBubbleSortWithArray500(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(500);
        System.out.println("-----------------------------------------------\n" +
                "|Testing Bubble Sort with an array size of 500|\n" +
                "-----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = BubbleSort.getBubbleSortOfArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 500")
    void testInsertionSortWithArray500(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(500);
        System.out.println("--------------------------------------------------\n" +
                "|Testing Insertion Sort with an array size of 500|\n" +
                "--------------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = InsertionSort.getSortedArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 500")
    void testBinarySortWithArray500(){
        BinaryTree testTree = new BinaryTree(30);
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(499);
        System.out.println("-----------------------------------------------\n" +
                "|Testing Binary Sort with an array size of 500|\n" +
                "-----------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        testTree.addElements(testArray);
        int [] sortedArray = testTree.getSortedTreeAsc();
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test bubble sort with array length 1000")
    void testBubbleSortWithArray1000(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(1000);
        System.out.println("------------------------------------------------\n" +
                "|Testing Bubble Sort with an array size of 1000|\n" +
                "------------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = BubbleSort.getBubbleSortOfArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 1000")
    void testInsertionSortWithArray1000(){
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(1000);
        System.out.println("---------------------------------------------------\n" +
                "|Testing Insertion Sort with an array size of 1000|\n" +
                "---------------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        int [] sortedArray = InsertionSort.getSortedArray(testArray);
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }

    @Test
    @DisplayName("Test insertion sort with array length 1000")
    void testBinarySortWithArray1000(){
        BinaryTree testTree = new BinaryTree(30);
        long startTime = System.nanoTime();
        int[] testArray = randomArrayToTest(999);
        System.out.println("------------------------------------------------\n" +
                "|Testing Binary Sort with an array size of 1000|\n" +
                "------------------------------------------------\n" +
                "Array to test:\n" + Arrays.toString(testArray) +
                "\nSorting....");
        testTree.addElements(testArray);
        int [] sortedArray = testTree.getSortedTreeAsc();
        long endTime = System.nanoTime();
        long time = (endTime - startTime);
        System.out.println("Sorted array:\n" + Arrays.toString(sortedArray) +
                "\nThis test took: " + time +" nanoseconds.\n" +
                "----------------------------------------------------------------------------------------------------------------------------");
    }
}
