package com.spartaglobal.sortmanager.model;

public class BinaryTreeSort implements Sorter {

    class Node {
        int key;
        Node left, right;

        public Node (int item){
            key = item;
            left = right = null;
        }
    }

    Node root;

    public BinaryTreeSort() {
        root = null;
    }

    public int[] sort(int[] intArray) {
        return new int[0];
    }

}
