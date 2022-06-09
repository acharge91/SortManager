package com.sparta.ac.start;


import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.sorter.Sorter;
import com.sparta.ac.display.DisplayInput;
import com.sparta.ac.display.DisplayOutput;

public abstract class SortLoader {

    public static void runSortLoader(){
        DisplayOutput.welcomeMessage();
        int userInput = DisplayInput.getUserSortChoice();
        while (userInput != 9) {
            try {
                int arraySize = DisplayInput.getUserArraySize();

                int[] arrayToSort = RandomArrayGenerator.arrayGenerator(arraySize);

                Sorter chosenSorter = SortFactory.userChoice(userInput, arrayToSort[0]);

                DisplayOutput.displayUnsortedArray(arrayToSort);

                DisplayOutput.displaySortMethod(chosenSorter.getName());

                int [] sortedArray = chosenSorter.startSort(arrayToSort);

                DisplayOutput.displayResults(sortedArray);

                DisplayOutput.displayTimer(chosenSorter.getTimer());

                userInput = DisplayInput.getUserSortChoice();

                if (userInput == 9){ DisplayOutput.goodbyeMessage();}
            } catch (InvalidSelectionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
