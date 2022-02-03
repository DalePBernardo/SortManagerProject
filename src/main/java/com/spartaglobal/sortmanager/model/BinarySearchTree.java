package com.spartaglobal.sortmanager.model;

import java.util.ArrayList;

public class BinarySearchTree implements Sorter {

    class Node {    // Node class for each element in the Binary tree
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
        if (intArray.length == 0)    // Return null if the array is empty
            return null;

        ArrayList<Integer> result = new ArrayList<>();

        root = new Node(intArray[0]);    // Makes the first element of the array to be the root value

        for (int i = 1; i < intArray.length; i++){    // Add the rest of the elements in the array to the tree
            addToTree(root, intArray[i]);
        }

        inOrderTraversal(root, result);    // Traverse through the Binary tree using in-order traversal5

        int[] outputArray = new int[result.size()];

        int i = 0;
        for (int num : result){    // Transfer the values to the int array
            outputArray[i] = num;
            i++;
        }

        return outputArray;
    }

    public Node addToTree(Node current, int value){
        // Traverses through the array in-order and forming the tree
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
        // Traversing through the array, adding each node value to the array list
        if (node != null){
            inOrderTraversal(node.left, result);
            result.add(node.value);
            inOrderTraversal(node.right, result);
        }
    }
}
