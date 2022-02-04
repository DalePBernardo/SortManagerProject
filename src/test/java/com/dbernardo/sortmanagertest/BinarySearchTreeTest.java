package com.dbernardo.sortmanagertest;

import com.dbernardo.sortmanager.model.BinarySearchTree;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchTreeTest {

    private static BinarySearchTree sut;

    @BeforeAll
    static void setUp(){
        sut = new BinarySearchTree();
    }

    @Test
    @DisplayName("Given an array of x numbers, Binary Search Tree is expected to return the array sorted")
    public void givenArrayOfPositiveNumbers_BinarySearchTree_ReturnsTheArraySorted(){
        int[] testInput = {23, 12, 4, 93, 74};
        assertArrayEquals(new int[]{4,12,23,74,93}, sut.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of 0 numbers, Binary Search Tree is expected to return null")
    public void givenArrayOfNoNumbers_BinarySearchTree_ReturnsNull(){
        int[] testInput = {};
        assertArrayEquals(null, sut.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of negative numbers, Binary Search Tree is expected to return the array sorted")
    public void givenArrayOfNegativeNumbers_BinarySearchTree_ReturnsTheArraySorted(){
        int[] testInput = {-34, -12, -87, -452, -234, -93};
        assertArrayEquals(new int[]{-452, -234, -93, -87, -34, -12}, sut.sort(testInput));
    }

    @Test
    @DisplayName("Given an array of zero numbers, Binary Search Tree is expected to return an array full of zeros")
    public void givenArrayOfZeroNumbers_BinarySearchTree_ReturnsTheArraySorted(){
        int[] testInput = {0, 0, 0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, sut.sort(testInput));
    }

    @Test
    @DisplayName("Given an array which is null, Binary Search Tree is expected to throw a NullPointerException")
    public void givenNullArray_BinarySearchTree_ReturnsANullPointerException(){
        int[] testInput = null;
        NullPointerException nExp = assertThrows(NullPointerException.class, () -> sut.sort(testInput), "No exception thrown");
    }

    @Test
    @DisplayName("Given an array of mixed negative and positive numbers, Binary Search Tree is expected to return a the sorted array")
    public void givenArrayOfMixedPositiveAndNegativeNumbers_BinarySearchTree_ReturnsTheArraySorted(){
        int[] testInput = {23, 9, -12, 43, -234, 124, 0};
        assertArrayEquals(new int[]{-234, -12, 0, 9, 23, 43, 124}, sut.sort(testInput));
    }
}
