package com.sparta.ac.performance.sorter.binarytree;

import com.sparta.ac.sorter.binarytree.BinaryTree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class BinaryTreeTest {

    @Test
    @DisplayName("Check correct root element value is returned")
    void checkCorrectRootElementReturned() {
        BinaryTree testTree = new BinaryTree(20);
        Assertions.assertEquals(20, testTree.getRootElement());
    }

    @Test
    @DisplayName("Check 1 element is returned")
    void check1ElementReturned() {
        BinaryTree testTree = new BinaryTree(20);
        Assertions.assertEquals(1, testTree.getNumberOfElements());
    }

    @Test
    @DisplayName("Check 6 elements are returned")
    void check6ElementsReturned() {
        BinaryTree testTree = new BinaryTree(9);
        int[] testArray = {1, 2, 3, 4, 5, 6};
        testTree.addElements(testArray);
        Assertions.assertEquals(7, testTree.getNumberOfElements());
    }

    @Test
    @DisplayName("Check true is returned for element found")
    void checkFoundElementTrue() {
        BinaryTree testTree = new BinaryTree(9);
        int[] testArray = {1, 2, 3, 4, 5, 6};
        testTree.addElements(testArray);
        Assertions.assertTrue(testTree.findElement(4));
    }

    @Test
    @DisplayName("Check false is returned for element not found")
    void checkNotFoundElementFalse() {
        BinaryTree testTree = new BinaryTree(9);
        int[] testArray = {1, 2, 3, 4, 5, 6};
        testTree.addElements(testArray);
        Assertions.assertFalse(testTree.findElement(10));
    }

    @Test
    @DisplayName("Check correct leftchild is returned")
    void checkCorrectLeftChildReturned() {
        BinaryTree testTree = new BinaryTree(9);
        int[] testArray = {1, 2, 3, 11, 20, 18, 15};
        testTree.addElements(testArray);
        Assertions.assertFalse(testTree.findElement(10));
    }
}
