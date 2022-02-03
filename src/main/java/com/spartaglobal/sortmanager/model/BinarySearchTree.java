package com.spartaglobal.sortmanager.model;

import java.util.ArrayList;

public class BinarySearchTree implements Sorter {

    class Node {
        int value;
        Node left, right;

        public Node (int value){
            this.value = value;
            left = right = null;
        }
    }

    Node root;

    public BinarySearchTree() {
    }

    public int[] sort(int[] intArray, int size){
        return sort(intArray);
    }

    public int[] sort(int[] intArray) {
        if (intArray.length == 0)
            return null;

        ArrayList<Integer> result = new ArrayList<>();

        root = new Node(intArray[0]);

        for (int i = 1; i < intArray.length; i++){
            addToTree(root, intArray[i]);
        }

        inOrderTraversal(root, result);

        int[] outputArray = new int[result.size()];

        int i = 0;
        for (int num : result){
            outputArray[i] = num;
            i++;
        }

        return outputArray;
    }

    public Node addToTree(Node current, int value){
        if (current == null)
            return new Node(value);

        if (value <= current.value){
            current.left = addToTree(current.left, value);
        } else if (value > current.value){
            current.right = addToTree(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void inOrderTraversal(Node node, ArrayList<Integer> result){
        if (node != null){
            inOrderTraversal(node.left, result);
            result.add(node.value);
            inOrderTraversal(node.right, result);
        }
    }
}
