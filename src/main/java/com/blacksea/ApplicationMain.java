package com.blacksea;

import java.util.Arrays;

public class ApplicationMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insertItem(10);
        binarySearchTree.insertItem(Arrays.asList(20,15,13,14,17,21,19));
        binarySearchTree.insertItem(new int[]{32,34,36,7,11,18});
        binarySearchTree.printAsOrdered();
        System.out.println("searching 13 in the tree -> " + binarySearchTree.search(13).getValue());
    }
}
