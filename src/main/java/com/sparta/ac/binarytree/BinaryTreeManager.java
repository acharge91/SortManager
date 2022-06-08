package com.sparta.ac.binarytree;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryTreeManager implements BinaryTree {
    private static Logger logger = Logger.getLogger("my logger");
    private final Node rootNode;
    private static int count = 0;

    private static int nodeCount = 1;
    private static int[] elementsArray;

    public BinaryTreeManager(final int element) {
        rootNode = new Node(element);
    }

    public void setElementsArray(int[] elements) {
        elementsArray = new int[elements.length + 1];
        elementsArray[count++] = rootNode.getValue();
        for (int element : elements) {elementsArray[count++] = element;}
        setNodeCount(elements);
    }

    public void setNodeCount(int[] array) {nodeCount += array.length;}

    @Override
    public int getRootElement() {
        logger.log(Level.INFO, "Returning root element " + rootNode.getValue());
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        logger.log(Level.INFO, "Returning count of elements " + nodeCount);
        return nodeCount;
    }

    @Override
    public void addElement(int element) {
        logger.log(Level.INFO, element + " added to tree");
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        setElementsArray(elements);
        logger.log(Level.INFO, Arrays.toString(elements) + " array received");
        for (int element : elements) {
            logger.log(Level.INFO, element + " iteration of array elements");
            addElement(element);
        }
    }

    @Override
    public boolean findElement(final int element){
        logger.log(Level.INFO, "returns boolean, checking if " + element + " is in the tree");
        Node node = findNodeInTree(element);
        return node != null;
    }

    //    Add exception for invalid selection.
    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNodeInTree(element);
        logger.log(Level.INFO, "checking if " + element + " has a left child");
        if (findElement(element)){
            if (node.getLeftChild() != null) {
                Node leftChild = node.getLeftChild();
                logger.log(Level.INFO, leftChild.getValue() + " returned as " + node.getValue() + "'s left child");
                return leftChild.getValue();
            } else {
                throw new ChildNotFoundException("'" + node.getValue() + "'" + " node does not have a left child");
            }
        }
        return 0;
    }

//    Add exception for invalid selection.
    @Override
    public int getRightChild(int element) throws ChildNotFoundException{
        Node node = findNodeInTree(element);
        logger.log(Level.INFO, "checking if " + element + " has a right child");
        if (findElement(element)) {
            if (node.getRightChild() != null) {
                Node rightChild = node.getRightChild();
                logger.log(Level.INFO, rightChild.getValue() + " returned as " + node.getValue() + "'s right child");
                return rightChild.getValue();
            } else {
                throw new ChildNotFoundException("'" + node.getValue() + "'" + " This node does not have a right child");
            }
        }
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        logger.log(Level.INFO, "receives " + Arrays.toString(elementsArray) + " to sort in ascending order");
        Arrays.sort(elementsArray);
        logger.log(Level.INFO, "output: " + Arrays.toString(elementsArray));
        return elementsArray;
    }

    @Override
    public int[] getSortedTreeDesc() {
        logger.log(Level.INFO, "receives " + Arrays.toString(elementsArray) + " to sort in descending order.");
        Arrays.sort(elementsArray);
        int [] reversedArray = getReverseArray(elementsArray);
        logger.log(Level.INFO, "output: " + Arrays.toString(elementsArray));
        return reversedArray;
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

    private int[] getReverseArray(int[] numArray) {
        for (int number : numArray) {
            for (int i = 0; i < numArray.length-1; i++) {
                if (numArray[i] < numArray[i+1]) {
                    numArray[i] = (numArray[i] + numArray[i+1]) - (numArray[i+1] = numArray[i]);
                }
            }
        }
        return numArray;
    }
}