package com.sparta.ac.mergearray;

import com.sparta.ac.bubblesort.BubbleSort;

import java.util.Arrays;

public class MergeArray {
    private static int[] arrayOne;
    private static int[] arrayTwo;
    private static int array1Counter = 0;
    private static int array2Counter = 0;
    private static int indexCount = 0;
    private int[] mergedArray;

    public void main(String[] args) {
        int[] arr1 = {2, 5, 8, 10, 40, 55};
        int[] arr2 = {1, 3, 7, 21, 76, 78};

    }
    public void setMergedArraySize() {
        mergedArray = new int[arrayOne.length + arrayTwo.length];
    }

    public void setArrayOne(int[] array) {
        arrayOne = array;
    }

    public void setArrayTwo(int[] array) {
        arrayTwo = array;
    }
    public int[] getMergedArray(){
        mergeArrays();
        return mergedArray;
    }

    private void sortArrays(int[] array) {
        BubbleSort.getBubbleSortOfArray(array);
    }

    private void mergeArrays() {
        sortArrays(arrayOne);
        sortArrays(arrayTwo);
        setMergedArraySize();
        while (array1Counter < arrayOne.length && array2Counter < arrayTwo.length) {
            if (arrayOne[array1Counter] < arrayTwo[array2Counter]) {
                mergedArray[indexCount++] = arrayOne[array1Counter++];
            } else {
                mergedArray[indexCount++] = arrayTwo[array2Counter++];
            }
        }
        while (array1Counter < arrayOne.length) {
            mergedArray[indexCount++] = arrayOne[array1Counter++];
        }
        while (array2Counter < arrayTwo.length) {
            mergedArray[indexCount++] = arrayTwo[array2Counter++];
        }
    }
}
