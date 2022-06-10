package com.sparta.ac.performance;

import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.start.RandomArrayGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomGeneratorTest {
    @Test
    @DisplayName("Check correct array length returned")
    void checkCorrectArrayLengthReturned() {
        RandomArrayGenerator.setUpperLimit(100);
        try {
            Assertions.assertEquals(5, RandomArrayGenerator.arrayGenerator(5).length);
        } catch (InvalidSelectionException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Check empty array returned")
    void checkEmptyArrayReturned() {
        RandomArrayGenerator.setUpperLimit(100);
        int[] expectedArray = {};
        try {
            Assertions.assertArrayEquals(expectedArray, RandomArrayGenerator.arrayGenerator(0));
        } catch (InvalidSelectionException e) {
            throw new RuntimeException(e);
        }
    }
}
