package com.sparta.ac.performance.sorter;

import com.sparta.ac.sorter.InsertionSort;
import com.sparta.ac.start.RandomArrayGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
    @Test
    @DisplayName("Test 1 element array returns 1 element array")
    void check1ElementArray(){
        int[] testArray = {3};
        int[] expectedResult = {3};
        Assertions.assertArrayEquals(expectedResult, InsertionSort.getSortedArray(testArray));
    }

    @Test
    @DisplayName("Test 0 element array returns 0 element array")
    void check0ElementArray(){
        int[] testArray = {};
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult, InsertionSort.getSortedArray(testArray));
    }

    @Test
    @DisplayName("Test array produces correct sorted array")
    void checkCorrectArrayReturned(){
        int[] testArray = {8, 4, 22, 1, 55, 33};
        int[] expectedResult = {1, 4, 8, 22, 33, 55};
        Assertions.assertArrayEquals(expectedResult, InsertionSort.getSortedArray(testArray));
    }

    @Test
    @DisplayName("Test array with negative integers produces correct sorted array")
    void checkArrayWithNegatives(){
        int[] testArray = {8, -4, 22, 1, -55, -33};
        int[] expectedResult = {-55, -33, -4, 1, 8, 22};
        Assertions.assertArrayEquals(expectedResult, InsertionSort.getSortedArray(testArray));
    }
}
