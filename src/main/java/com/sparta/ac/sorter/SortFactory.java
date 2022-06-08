package com.sparta.ac.sorter;

public class SortFactory {

    public static void userChoice(int userChoice) {
        switch (userChoice) {
            case 1 -> SortLoader.bubbleSortLoader();
            case 2 -> SortLoader.mergeArrayLoader();
            case 3 -> SortLoader.binarySortLoader();
        }
    }
}
