package com.sparta.ac.performance.sorter;

import com.sparta.ac.sorter.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    @DisplayName("Test returns numbers in sequence")
    void checkNumbersReturnedInOrder() {
        int[] numArrayToCheck = {2,1};
        int[] numArrayExpected = {1,2};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

    @Test
    @DisplayName("Test returns 1 element arrays in sequence")
    void checkSingleElementReturnedInOrder() {
        int[] numArrayToCheck = {1};
        int[] numArrayExpected = {1};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

    @Test
    @DisplayName("Test empty array returns empty array")
    void checkEmptyArrayReturnsEmptyArray(){
        int[] numArrayToCheck = {};
        int[] numArrayExpected = {};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

    @Test
    @DisplayName("Test returns multiple numbers in sequence")
    void checkMultipleNumbersReturnedInOrder() {
        int[] numArrayToCheck = {2,99,1,17,26,45};
        int[] numArrayExpected = {1,2,17,26,45,99};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

    @Test
    @DisplayName("Test returns negative numbers in sequence")
    void checkNegativeNumbersReturnedInOrder() {
        int[] numArrayToCheck = {-2,-99,-1,-17,-26,-45};
        int[] numArrayExpected = {-99,-45,-26,-17,-2,-1};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

    @Test
    @DisplayName("Test returns mixed numbers in sequence")
    void checkMixedNumbersReturnedInOrder() {
        int[] numArrayToCheck = {2,99,1,-17,-26,-45};
        int[] numArrayExpected = {-45,-26,-17,1,2,99};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }
}
