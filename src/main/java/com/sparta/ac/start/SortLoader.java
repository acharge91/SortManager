package com.sparta.ac.start;


import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.sorter.Sorter;
import com.sparta.ac.display.DisplayInput;
import com.sparta.ac.display.DisplayOutput;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SortLoader {

    private static final Logger logger = Logger.getLogger("SortFactory logger");
    public static void runSortLoader(){
        DisplayOutput.welcomeMessage();
        logger.log(Level.INFO, "Display welcome message");
        int userInput = DisplayInput.getUserSortChoice();
        logger.log(Level.INFO, "get user input" + userInput + " and assign to userInput variable.");

        while (userInput != 9) {
            int elementUpperLimit = 500;
            int[] arrayToSort = getArrayToSort(elementUpperLimit);
            if (arrayToSort.length < 1) {
                userInput = askForFurtherInput();
                continue;
            }

            Sorter chosenSorter = getChosenSorter(userInput, arrayToSort);
            if (chosenSorter == null) {
                userInput = askForFurtherInput();
                continue;
            }

            displayArrayAndSorter(arrayToSort, chosenSorter);

            int anotherSorter = DisplayInput.getSortAnotherChoice();
            int [] sortedArray = chosenSorter.startSort(arrayToSort);
            long chosenSorterTime = chosenSorter.getTimer();
            if (anotherSorter == 1 ) {
                userInput = DisplayInput.getComparisonSorter(chosenSorter.getName());
                Sorter secondChosenSorter = getChosenSorter(userInput, arrayToSort);
                DisplayOutput.displayTwoSortingMethods(chosenSorter.getName(), secondChosenSorter.getName());

                int[] secondSortedArray = secondChosenSorter.startSort(arrayToSort);

                long secondSorterTimer = secondChosenSorter.getTimer();

                displayTwoResults(chosenSorter, sortedArray, chosenSorterTime, secondChosenSorter, secondSortedArray, secondSorterTimer);
                if (chosenSorterTime < secondSorterTimer){
                    DisplayOutput.displayWinner(chosenSorter.getName(), secondSorterTimer - chosenSorterTime);
                } else {
                    DisplayOutput.displayWinner(secondChosenSorter.getName(), chosenSorterTime - secondSorterTimer);
                }

            } else {

                logger.log(Level.INFO, "Call chosenSorter.startSort() with arrayToSort and assign to sortedArray " + Arrays.toString(sortedArray));

                displayResults(chosenSorterTime, sortedArray);
            }

            userInput = askForFurtherInput();
        }
    }

    private static int askForFurtherInput() {
        int userInput = DisplayInput.getUserSortChoice();
        logger.log(Level.INFO, "Ask for user input again and reassign userInput: " + userInput);

        if (userInput == 9){
            logger.log(Level.FINE, "Display goodbye message if 9 entered");

            DisplayOutput.goodbyeMessage();
        }
        return userInput;
    }

    private static void displayResults(long chosenSorterTime, int[] sortedArray) {
        DisplayOutput.displayResults(sortedArray);
        logger.log(Level.INFO, "Display sortedArray");


        DisplayOutput.displayTimer(chosenSorterTime);
        logger.log(Level.INFO, "Display chosenSorterTime " + chosenSorterTime);
    }

    private static void displayTwoResults(Sorter chosenSorter, int[] sortedArray, long chosenSorterTime, Sorter secondChosenSorter, int[] secondSortedArray, long secondSorterTime) {
        DisplayOutput.displayTwoResults(chosenSorter.getName(), sortedArray, chosenSorterTime, secondChosenSorter.getName(), secondSortedArray, secondSorterTime);
    }

    private static void displayArrayAndSorter(int[] arrayToSort, Sorter chosenSorter) {
        DisplayOutput.displayUnsortedArray(arrayToSort);
        logger.log(Level.INFO, "Display arrayToSort.");

        DisplayOutput.displaySortMethod(chosenSorter.getName());
        logger.log(Level.INFO, "Display chosenSorter.getName() " + chosenSorter.getName());
    }

    private static Sorter getChosenSorter(int userInput, int[] arrayToSort) {
        Sorter chosenSorter = null;
        try {
            chosenSorter = SortFactory.userChoice(userInput, arrayToSort[0]);
        } catch (InvalidSelectionException e) {
            System.out.println(e.getMessage());
        }
        logger.log(Level.INFO, "Call SortFactory.userChoice with variable userInput: " + userInput +" and first element of arrayToSort: "+ arrayToSort[0] + ". Chosen sorter variable. " + chosenSorter);
        return chosenSorter;
    }

    private static int[] getArrayToSort(int elementUpperLimit) {
        RandomArrayGenerator.setUpperLimit(elementUpperLimit);
        logger.log(Level.INFO, "RandomArrayGenerator.setUpperLimit to: " + elementUpperLimit);

        int arraySize = DisplayInput.getUserArraySize();
        logger.log(Level.INFO, "get user input" + arraySize + " and assign to arraySize variable.");


        int[] arrayToSort = new int[0];
        try {
            arrayToSort = RandomArrayGenerator.arrayGenerator(arraySize);
            logger.log(Level.INFO, "Call RandomArrayGenerator.arrayGenerator with " + arraySize + " and assign to arrayToSort variable.");
        } catch (InvalidSelectionException e) {
            System.out.println(e.getMessage());
        }


        return arrayToSort;

    }
}
