package com.sparta.ac.start;


import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.sorter.Sorter;
import com.sparta.ac.display.DisplayInput;
import com.sparta.ac.display.DisplayOutput;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class SortLoader {

    private static Logger logger = Logger.getLogger("SortFactory logger");
    public static void runSortLoader(){
        DisplayOutput.welcomeMessage();
        logger.log(Level.INFO, "Display welcome message");
        int userInput = DisplayInput.getUserSortChoice();
        logger.log(Level.INFO, "get user input" + userInput + " and assign to userInput variable.");

        while (userInput != 9) {
            int elementUpperLimit = 500;
            int[] arrayToSort = getArrayToSort(userInput, elementUpperLimit);

            Sorter chosenSorter = getChosenSorter(userInput, arrayToSort);
            if (chosenSorter == null) {
                userInput = askForFurtherInput();
                continue;
            }

            displayArrayAndSorter(arrayToSort, chosenSorter);

            int [] sortedArray = chosenSorter.startSort(arrayToSort);
            logger.log(Level.INFO, "Call chosenSorter.startSort() with arrayToSort and assign to sortedArray " + Arrays.toString(sortedArray));

            displayResults(chosenSorter, sortedArray);

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

    private static void displayResults(Sorter chosenSorter, int[] sortedArray) {
        DisplayOutput.displayResults(sortedArray);
        logger.log(Level.INFO, "Display sortedArray");


        DisplayOutput.displayTimer(chosenSorter.getTimer());
        logger.log(Level.INFO, "Display chosenSorter.getTimer() " + chosenSorter.getTimer());
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

    private static int[] getArrayToSort(int userInput, int elementUpperLimit) {
        RandomArrayGenerator.setUpperLimit(elementUpperLimit);
        logger.log(Level.INFO, "RandomArrayGenerator.setUpperLimit to: " + elementUpperLimit);

        int arraySize = DisplayInput.getUserArraySize();
        logger.log(Level.INFO, "get user input" + arraySize + " and assign to arraySize variable.");

        int[] arrayToSort = RandomArrayGenerator.arrayGenerator(arraySize);

        logger.log(Level.INFO, "Call RandomArrayGenerator.arrayGenerator with " + userInput + " and assign to arrayToSort variable.");
        return arrayToSort;
    }

}
