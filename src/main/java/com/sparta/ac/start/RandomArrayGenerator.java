package com.sparta.ac.start;

import java.util.Random;

public abstract class RandomArrayGenerator {

    public static int[] arrayGenerator(int length){
        int[] randomArray = new int[length];
        for (int i = 0; i < length; i++) {
            randomArray[i] = numberGenerator();
        }
        return randomArray;
    }

    private static int numberGenerator() {
        Random rand = new Random();
        int upperbound = 100;
        int randomInt = rand.nextInt(upperbound);
        return randomInt;
    }
}
