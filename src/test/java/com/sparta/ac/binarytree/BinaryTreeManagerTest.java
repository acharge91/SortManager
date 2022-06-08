package com.sparta.ac.binarytree;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class BinaryTreeManagerTest {

    private static BinaryTreeManager testTree = new BinaryTreeManager(20);

    @Test
    @DisplayName("Check correct root element value is returned")
    void checkCorrectRootElementReturned() {
        Assertions.assertEquals(20, testTree.getRootElement());
    }

    @Test
    @DisplayName("Check 1 element is returned")
    void check1ElementReturned() {
        Assertions.assertEquals(1, testTree.getNumberOfElements());
    }

    @Test
    @DisplayName("Check 6 elements are returned")
    void check6ElementsReturned() {
        BinaryTreeManager testTree = new BinaryTreeManager(9);
        int[] testArray = {1, 2, 3, 4, 5, 6};
        testTree.addElements(testArray);
        Assertions.assertEquals(7, testTree.getNumberOfElements());
    }

    @Test
    @DisplayName("Check element is added as the leftchid of the root node")
    void checkElementAddedAsLeftChild() {
        BinaryTreeManager testTree = new BinaryTreeManager(9);
        testTree.addElement(3);
        Assertions.assertEquals(2, testTree.getNumberOfElements());
        try {
            Assertions.assertEquals(3, testTree.getLeftChild(9));
        } catch (ChildNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Check element is added as the rightchid of the root node")
    void checkElementAddedAsRightChild() {
        BinaryTreeManager testTree = new BinaryTreeManager(9);
        testTree.addElement(23);
        Assertions.assertEquals(2, testTree.getNumberOfElements());
        try {
            Assertions.assertEquals(23, testTree.getRightChild(9));
        } catch (ChildNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Check true is returned for element found")
    void checkFoundElementTrue() {
        BinaryTreeManager testTree = new BinaryTreeManager(9);
        int[] testArray = {1, 2, 3, 4, 5, 6};
        testTree.addElements(testArray);
        Assertions.assertTrue(testTree.findElement(4));
    }

    @Test
    @DisplayName("Check false is returned for element not found")
    void checkNotFoundElementFalse() {
        BinaryTreeManager testTree = new BinaryTreeManager(9);
        int[] testArray = {1, 2, 3, 4, 5, 6};
        testTree.addElements(testArray);
        Assertions.assertFalse(testTree.findElement(10));
    }

    @Test
    @DisplayName("Check correct leftchild is returned")
    void checkCorrectLeftChildReturned() {
        BinaryTreeManager testTree = new BinaryTreeManager(9);
        int[] testArray = {1, 2, 3, 11, 20, 18, 15};
        testTree.addElements(testArray);
        Assertions.assertFalse(testTree.findElement(10));
    }

}
