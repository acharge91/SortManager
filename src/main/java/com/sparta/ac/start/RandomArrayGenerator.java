package com.sparta.ac.start;

import com.sparta.ac.exceptions.InvalidSelectionException;

import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class RandomArrayGenerator {

    private static int upperLimit;

    public static void setUpperLimit(int upperLimit){
        RandomArrayGenerator.upperLimit = upperLimit;
    }

    private static Logger logger = Logger.getLogger("Random Array sort logger");
    public static int[] arrayGenerator(int length) {
        logger.log(Level.INFO, "Received length of array to generate " + length);
        int[] randomArray = new int[length];
        logger.log(Level.INFO, "Instantiate an empty array with length. Array:  " + Arrays.toString(randomArray));
        for (int i = 0; i < length; i++) {
            randomArray[i] = numberGenerator();
            logger.log(Level.INFO, "Iterate through array calling numberGenerator. Add random number to " + i + " index.");

        }
        logger.log(Level.INFO, "Return completed array " + Arrays.toString(randomArray));
        return randomArray;
    }

    private static int numberGenerator() {
        Random rand = new Random();
        int randomInt = rand.nextInt(upperLimit);
        logger.log(Level.INFO, "Instantiate new Random object. Create upperbound variable with value of: " + upperLimit + ". Generate and return random int: " + randomInt);

        return randomInt;
    }
}
