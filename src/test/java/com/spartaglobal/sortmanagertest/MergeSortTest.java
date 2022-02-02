package com.spartaglobal.sortmanagertest;

import com.spartaglobal.sortmanager.model.MergeSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MergeSortTest {
    private static MergeSort sut;

    @BeforeAll
    static void setUp(){
        sut = new MergeSort();
    }

    @Test
    @DisplayName("Given an array of x numbers, Bubble sort is expected to return the array sorted")
    public void givenArrayOfPositiveNumbers_BubbleSort_ReturnsTheArraySorted(){
        int[] testInput = {23, 12, 4, 93, 74};
        assertArrayEquals(new int[]{4,12,23,74,93}, sut.sort(testInput, 5));
    }

    @Test
    @DisplayName("Given an array of 0 numbers, Bubble sort is expected to return null")
    public void givenArrayOfNoNumbers_BubbleSort_ReturnsNull(){
        int[] testInput = {};
        assertArrayEquals(null, sut.sort(testInput, 0));
    }

    @Test
    @DisplayName("Given an array of negative numbers, Bubble sort is expected to return the array sorted")
    public void givenArrayOfNegativeNumbers_BubbleSort_ReturnsTheArraySorted(){
        int[] testInput = {-34, -12, -87, -452, -234, -93};
        assertArrayEquals(new int[]{-452, -234, -93, -87, -34, -12}, sut.sort(testInput, 6));
    }

    @Test
    @DisplayName("Given an array of zero numbers, Bubble sort is expected to return an array full of zeros")
    public void givenArrayOfZeroNumbers_BubbleSort_ReturnsTheArraySorted(){
        int[] testInput = {0, 0, 0, 0, 0};
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, sut.sort(testInput, 5));
    }

    @Test
    @DisplayName("Given an array which is null, Merge sort is expected to throw a NullPointerException")
    public void givenNullArray_MergeSort_ReturnsANullPointerException(){
        int[] testInput = null;
        NullPointerException nExp = assertThrows(NullPointerException.class, () -> sut.sort(testInput), "No exception thrown");
    }
}
