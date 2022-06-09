package com.sparta.ac.performance.sorter.binarytree;

import com.sparta.ac.sorter.binarytree.Node;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class NodeTest {

    private static Node testRootNode = new Node(20);

    @Test
    @DisplayName("Check node object is instantiated with correct value attribute")
    void checkCorrectNodeValueReturned() {
        Assertions.assertEquals(20, testRootNode.getValue());
    }

    @Test
    @DisplayName("Check node object is instantiated with negative value attribute")
    void checkCorrectNegativeNodeValueReturned() {
        Node testRootNode = new Node(-5);
        Assertions.assertEquals(-5, testRootNode.getValue());
    }

    @Test
    @DisplayName("Check node object is instantiated with leftChild attribute as null")
    void checkLeftChildReturnsNull() {
        Assertions.assertEquals(null, testRootNode.getLeftChild());
    }
    @Test
    @DisplayName("Check node object is instantiated with rightChild attribute as null")
    void checkRightChildReturnsNull() {
//      Node testRootNode = new Node(3);
        Assertions.assertEquals(null, testRootNode.getRightChild());
    }

    @Test
    @DisplayName("Check node object's leftChild is set to 10")
    void checkLeftChildSetTo10() {
        Node testRootNode = new Node(20);
        Node leftChildTestNode = new Node(10);
        testRootNode.setLeftChild(leftChildTestNode);
        Assertions.assertEquals(leftChildTestNode, testRootNode.getLeftChild());
        Assertions.assertEquals(10, testRootNode.getLeftChild().getValue());
    }

    @Test
    @DisplayName("Check node object's rightChild is set to 5")
    void checkRightChildSetTo10() {
        Node testRootNode = new Node(20);
        Node rightChildTestNode = new Node(5);
        testRootNode.setRightChild(rightChildTestNode);
        Assertions.assertEquals(rightChildTestNode, testRootNode.getRightChild());
        Assertions.assertEquals(5, testRootNode.getRightChild().getValue());
    }

    @Test
    @DisplayName("Check empty leftChild returns true")
    void checkEmptyLeftChildReturnsTrue() {
        Assertions.assertTrue(testRootNode.isLeftChildEmpty());
    }

    @Test
    @DisplayName("Check empty rightChild returns true")
    void checkEmptyRightChildReturnsTrue() {
        Assertions.assertTrue(testRootNode.isRightChildEmpty());
    }

    @Test
    @DisplayName("Check present leftChild returns false")
    void checkPresentRightChildReturnsFalse() {
        Node testRootNode = new Node(20);
        Node leftChildTestNode = new Node(10);
        testRootNode.setLeftChild(leftChildTestNode);
        Assertions.assertFalse(testRootNode.isLeftChildEmpty());
    }

    @Test
    @DisplayName("Check present rightChild returns false")
    void checkPresentLeftChildReturnsFalse() {
        Node testRootNode = new Node(20);
        Node rightChildTestNode = new Node(5);
        testRootNode.setRightChild(rightChildTestNode);
        Assertions.assertFalse(testRootNode.isRightChildEmpty());
    }
}
