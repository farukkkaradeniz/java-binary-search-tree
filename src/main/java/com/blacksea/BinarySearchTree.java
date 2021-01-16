package com.blacksea;

import java.util.List;

class BinarySearchTree {
    private Node root;

    BinarySearchTree() {
        this.root = null;
    }

    void insertItem(int value) {
        root = insertRecursively(root,value);
    }

    void insertItem(List<Integer> values) {
        for (Integer value : values) {
            insertItem(value);
        }
    }

    void insertItem(int[] values) {
        for (int value : values) {
            insertItem(value);
        }
    }

    void printAsOrdered() {
        orderedRecursively(root);
    }

    Node search(int value) {
        return searchRecursively(root,value);
    }

    private Node insertRecursively(Node root,int value) {
        if (root == null) {
            // If actual tree is empty returns new node
            root = new Node(value);
            return root;
        }
        if (value < root.getValue()) {
            // If given value is smaller than root's value then it should be located to left side.
            // recursively tracks the root and puts the value correctly left child
            root.setLeft(
                    insertRecursively(root.getLeft(),value)
            );
        }
        if (value > root.getValue()) {
            // If given value is bigger than root's value then it should be located to right side.
            // recursively tracks the root and puts the value correctly right child
            root.setRight(
                    insertRecursively(root.getRight(),value)
            );
        }
        return root;
    }

    private void orderedRecursively(Node root) {
        if (root != null) {
            orderedRecursively(root.getLeft());
            System.out.println(root.getValue());
            orderedRecursively(root.getRight());
        }
    }

    private Node searchRecursively(Node root,int value) {
        // Best case. It means tree is empty or given value is top of the tree
        if (root == null || root.getValue() == value)
            return root;
        if (value < root.getValue()) {
            // when given value is smaller than root's value the application should be check left child
            return searchRecursively(root.getLeft(),value);
        } else {
            // when given value is bigger than root's value the application should be check right child
            return searchRecursively(root.getRight(),value);
        }
    }
}
