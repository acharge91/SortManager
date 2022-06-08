package com.sparta.ac.mergearray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MergeArrayTest {
    @Test
    @DisplayName("Test basic ordered arrays are merged")
    void checkBasicOrderedArraysMerged() {
        int[] arr1 = {1, 3};
        int[] arr2 = {2, 4};
        MergeArray testMergeOne = new MergeArray();
        testMergeOne.setArrayOne(arr1);
        testMergeOne.setArrayTwo(arr2);
        int[] expectedArray = {1, 2, 3, 4};
        Assertions.assertArrayEquals(expectedArray, testMergeOne.getMergedArray());
    }

    @Test
    @DisplayName("Test arrays with 1 element in are merged")
    void checkOneElementArraysMerged() {
        int[] testArrayOne = {4};
        int[] testArrayTwo = {2};
        MergeArray testMergeTwo = new MergeArray();
        testMergeTwo.setArrayOne(testArrayOne);
        testMergeTwo.setArrayTwo(testArrayTwo);
        int[] expectedArray = {2, 4};
        Assertions.assertArrayEquals(expectedArray, testMergeTwo.getMergedArray());
    }

    @Test
    @DisplayName("Test larger array is merged")
    void checkLargerArrayIsMerged() {
        int[] testArrayOne = {1, 5, 17, 22, 39, 98};
        int[] testArrayTwo = {3, 11, 35, 40, 96};
        MergeArray testMergeThree = new MergeArray();
        testMergeThree.setArrayOne(testArrayOne);
        testMergeThree.setArrayTwo(testArrayTwo);
        int[] expectedArray = {1, 3, 5, 11, 17, 22, 35, 39, 40, 96, 98};
        Assertions.assertArrayEquals(expectedArray, testMergeThree.getMergedArray());
    }

    @Test
    @DisplayName("Test array with negative numbers")
    void checkNagativeArrayIsMerged() {
        int[] testArrayOne = {-5, -1, 17, 22, 39, 98};
        int[] testArrayTwo = {-3, 11, 35, 40, 96};
        MergeArray testMergeThree = new MergeArray();
        testMergeThree.setArrayOne(testArrayOne);
        testMergeThree.setArrayTwo(testArrayTwo);
        int[] expectedArray = {-5, -3, -1, 11, 17, 22, 35, 39, 40, 96, 98};
        Assertions.assertArrayEquals(expectedArray, testMergeThree.getMergedArray());
    }

}
