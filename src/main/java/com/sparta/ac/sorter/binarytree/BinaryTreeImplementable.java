package com.sparta.ac.sorter.binarytree;

import com.sparta.ac.exceptions.ChildNotFoundException;
import com.sparta.ac.exceptions.InvalidSelectionException;

public interface BinaryTreeImplementable {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element) throws ChildNotFoundException, InvalidSelectionException;

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}
