package com.sparta.ac.sorter.binarytree;

import com.sparta.ac.exceptions.ChildNotFoundException;
import com.sparta.ac.sorter.Sorter;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryTree implements BinaryTreeImplementable, Sorter {

    private static final Logger logger = Logger.getLogger("Binary sort logger");
    private final Node rootNode;
    private static int count;

    private static int nodeCount;
    private static int[] elementsArray;

    private static long timer;

    public BinaryTree(final int element) {
        rootNode = new Node(element);
        nodeCount = 0;
    }

    public String getName(){
        logger.log(Level.INFO, "Returning string sorter name: Binary tree sort.");
        return "Binary tree sort";}

    @Override
    public int getRootElement() {
        logger.log(Level.INFO, "Returning root element " + rootNode.getValue());
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        nodeCount = countTreeElements(rootNode);
        logger.log(Level.INFO, "Call countTreeElements and assigning to nodeCount. Returning nodeCount " + nodeCount);
        return nodeCount;
    }

    @Override
    public void addElement(int element) {
        logger.log(Level.INFO, "Calling addNodeToTree method with " + element);
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        logger.log(Level.INFO, Arrays.toString(elements) + " array received");
        for (int element : elements) {
            logger.log(Level.FINE, element + " iteration of array elements");
            addElement(element);
        }
        getNumberOfElements();
    }

    @Override
    public boolean findElement(final int element){
        logger.log(Level.INFO, "Checking if " + element + " is in the tree");
        Node node = findNodeInTree(element);
        return node != null;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNodeInTree(element);
        logger.log(Level.INFO, "checking if " + element + " has a left child");
        if (node.getLeftChild() != null) {
            Node leftChild = node.getLeftChild();
            logger.log(Level.FINE, leftChild.getValue() + " returned as " + node.getValue() + "'s left child");
            return leftChild.getValue();
        } else {
            throw new ChildNotFoundException("'" + node.getValue() + "'" + " node does not have a left child");
        }
    }


    @Override
    public int getRightChild(int element) throws ChildNotFoundException{
        Node node = findNodeInTree(element);
        logger.log(Level.INFO, "checking if " + element + " has a right child");
        if (node.getRightChild() != null) {
            Node rightChild = node.getRightChild();
            logger.log(Level.FINE, rightChild.getValue() + " returned as " + node.getValue() + "'s right child");
            return rightChild.getValue();
        } else {
            throw new ChildNotFoundException("'" + node.getValue() + "'" + " This node does not have a right child");
        }

    }

    @Override
    public int[] getSortedTreeAsc() {
        count = 0;
        logger.log(Level.INFO, "Reset count field to 0. Count field: " + count);
        elementsArray = new int[nodeCount];
        logger.log(Level.INFO, "Instantiating elementsArray field with nodeCount (" + nodeCount + ") size of array. elementsArray: " + Arrays.toString(elementsArray));
        long startTime = System.nanoTime();
        traverseLeftSide(rootNode);
        long endTime = System.nanoTime();
        timer = (endTime - startTime);
        logger.log(Level.INFO, "Start timer before traverseLeftSide method call. Start time: " + startTime + ". Call method. Stop time: " + endTime + ". produce total time taken: " + timer + " and assign value to timer field.");
        logger.log(Level.INFO, "Traverse left of binary tree and add each element to elementsArray to get sorted array ascending. Output: " + Arrays.toString(elementsArray));
        return elementsArray;
    }

    private static void traverseLeftSide(Node node){
        if(node == null) {
            return;
        }
        if (!node.isLeftChildEmpty()) {
            traverseLeftSide(node.getLeftChild());
        }
        addElementToArray(node.getValue());
        if (!node.isRightChildEmpty()) {
            traverseLeftSide(node.getRightChild());
        }
    }

    private static void addElementToArray(int nodeValue) {
        elementsArray[count++] = nodeValue;
    }

    public long getTimer() {
        logger.log(Level.INFO, "Return timer field: " + timer);
        return timer;
    }

    @Override
    public int[] getSortedTreeDesc() {
        count = 0;
        logger.log(Level.INFO, "Reset count field to 0. Count field: " + count);
        elementsArray = new int[nodeCount];
        logger.log(Level.INFO, "Instantiating elementsArray field with nodeCount (" + nodeCount + ") size of array. elementsArray: " + Arrays.toString(elementsArray));
        long startTime = System.nanoTime();
        traverseRightSide(rootNode);
        long endTime = System.nanoTime();
        timer = (endTime - startTime);
        logger.log(Level.INFO, "Start timer before traverseRightSide method call. Start time: " + startTime + ". Call method. Stop time: " + endTime + ". produce total time taken: " + timer + " and assign value to timer field.");
        logger.log(Level.INFO, "Traverse right of binary tree and add each element to elementsArray to get sorted array descending. Output: " + Arrays.toString(elementsArray));

        return elementsArray;
    }

    private static void traverseRightSide(Node node) {
        if(node == null) {
            return;
        }
        if (!node.isRightChildEmpty()) {
            traverseLeftSide(node.getRightChild());
        }
        addElementToArray(node.getValue());
        if (!node.isLeftChildEmpty()) {
            traverseLeftSide(node.getLeftChild());
        }
    }

    private void addNodeToTree(Node node, int element) {
        logger.log(Level.INFO, node.getValue() + " received as root node. " + element + " received as element to add.");
        if (element <= node.getValue()) {
            logger.log(Level.FINE, element + " is less than current node: " + node.getValue());
            if (node.isLeftChildEmpty()) {
                logger.log(Level.FINER, "current node: " + node.getValue() + " does not have a left child.");
                Node leftChild = new Node(element);
                node.setLeftChild(leftChild);
                logger.log(Level.FINER, "creates a new node object with element " + leftChild.getValue() + " and sets it to current node left child.");

            } else {
                addNodeToTree(node.getLeftChild(), element);
                logger.log(Level.FINER, "current node has a left child. addNodeToTree recursively called with current node's left child: " + node.getLeftChild().getValue() + " as argument. ");
            }
        } else if (element > node.getValue()) {
            logger.log(Level.FINE, element + " is more than current node: " + node.getValue());
            if (node.isRightChildEmpty()) {
                logger.log(Level.FINER, "current node: " + node.getValue() + " does not have a right child.");
                Node rightChild = new Node(element);
                node.setRightChild(rightChild);
                logger.log(Level.FINER, "creates a new node object with element " + rightChild.getValue() + " and sets it to current node right child.");
            } else {
                addNodeToTree(node.getRightChild(), element);
                logger.log(Level.FINER, "current node has a right child. addNodeToTree recursively called with current node's right child: " + node.getRightChild().getValue() + " as argument. ");
            }
        }

    }

    private Node findNodeInTree(int element) {
        logger.log(Level.INFO, element + " received as node to find");
        Node node = rootNode;
        while (node != null) {
            logger.log(Level.INFO, "While current node is not null, run if statements");
            if (element == node.getValue()) {
                logger.log(Level.INFO, "Current node value " + node.getValue() + " is equal to element " + element + "return the node");
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
                logger.log(Level.INFO, "Current node value is less than element " + element + "node variable is == current node's left child");
            } else {
                node = node.getRightChild();
                logger.log(Level.INFO, "Current node value is greater than element " + element + "node variable is == current node's right child");

            }
        }
        return null;
    }

    private static int countTreeElements(Node node) {
        if(node == null)
            return 0;
        return 1 + countTreeElements(node.getLeftChild()) + countTreeElements(node.getRightChild());
    }

    @Override
    public int[] startSort(int[] arrayToSort) {
        logger.log(Level.INFO, "Received array to sort: " + Arrays.toString(arrayToSort));
        int[] elementsArray = Arrays.copyOfRange(arrayToSort, 1, arrayToSort.length);
        logger.log(Level.INFO, "Created new array minus the first element to account for root node " + Arrays.toString(elementsArray) + ".  Call addElements method with array.");
        addElements(elementsArray);
        return getSortedTreeAsc();
    }
}