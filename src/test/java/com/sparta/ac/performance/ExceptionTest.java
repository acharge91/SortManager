package com.sparta.ac.performance;

import com.sparta.ac.exceptions.ChildNotFoundException;
import com.sparta.ac.exceptions.InvalidSelectionException;
import com.sparta.ac.sorter.binarytree.BinaryTree;
import com.sparta.ac.start.RandomArrayGenerator;
import com.sparta.ac.start.SortFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    @Test
    @DisplayName("Test that ChildNotFoundException is thrown with no child")
    void checkExceptionThrownNoChild(){
        BinaryTree testTree = new BinaryTree(5);
        Assertions.assertThrows(ChildNotFoundException.class, () -> testTree.getLeftChild(5));
    }

    @Test
    @DisplayName("Test that ChildNotFoundException is NOT thrown with present child")
    void checkExceptionNotThrownWithChild(){
        BinaryTree testTree = new BinaryTree(5);
        testTree.addElement(3);
        Assertions.assertDoesNotThrow(() -> testTree.getLeftChild(5));
    }

    @Test
    @DisplayName("Test that InvalidSelectionException is thrown with selection 5")
    void checkExceptionThrownWith5(){
        Assertions.assertThrows(InvalidSelectionException.class, () -> SortFactory.userChoice(5, 3));
    }

    @Test
    @DisplayName("Test that InvalidSelectionException is NOT thrown with selection 3")
    void checkExceptionNotThrownWith3(){
        Assertions.assertDoesNotThrow(() -> SortFactory.userChoice(3, 3));
    }

    @Test
    @DisplayName("Test that InvalidSelectionException is thrown with negative")
    void checkExceptionThrownWithNegative(){
        Assertions.assertThrows(InvalidSelectionException.class, () -> RandomArrayGenerator.arrayGenerator(-4));
    }

    @Test
    @DisplayName("Test that InvalidSelectionException is NOT thrown with positive")
    void checkExceptionNotThrownPositive(){
        RandomArrayGenerator.setUpperLimit(3);
        Assertions.assertDoesNotThrow(() -> RandomArrayGenerator.arrayGenerator(4));
    }
}
