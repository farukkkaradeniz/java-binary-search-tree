package com.blacksea;

public class Node {
    private int value;
    private Node left;
    private Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }
}
