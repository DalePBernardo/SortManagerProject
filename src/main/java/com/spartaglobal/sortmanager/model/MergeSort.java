package com.spartaglobal.sortmanager.model;

public class MergeSort implements Sorter {

    public int[] sort(int[] intArray){
        return sort(intArray, intArray.length);
    }

    public int[] sort(int[] intArray, int size){
        if (size <= 0 || intArray.length == 0)    // Return null if array is empty of given n is negative
            return null;

        if (size < 2 || intArray.length < 2)    // Return the list back if it only contains 1 or 2 elements
            return intArray;

        int mid = size / 2;    // Find the middle point of the current array for this iteration
        int[] left = new int[mid];    // Split the array into half
        int[] right = new int[size - mid];

        for(int i = 0; i < mid; i++){    // Go through the original array and everything on left side add it to left array
            left[i] = intArray[i];
        }

        for(int i = mid; i < size; i++){    // Like wise with right side
            right[i - mid] = intArray[i];
        }

        sort(left, mid);    // Recursion through the array to multiple single element arrays
        sort(right, size - mid);    // Both on left and right side

        return merge(intArray, left, right, mid, size - mid);    // Return the merged array after calling the merge method
    }

    public static int[] merge(int[] intArray, int[] left, int[] right, int leftPointer, int rightPointer){
        int i = 0, j = 0, k = 0;    // Indexes
        while(i < leftPointer && j < rightPointer){    // Go through the separated arrays and places them back to the intArray depending on their value
            if (left[i] <= right[j]) {
                intArray[k++] = left[i++];
            } else {
                intArray[k++] = right[j++];
            }
        }
        while (i < leftPointer){    // Merge the leftovers from the left side
            intArray[k++] = left[i++];
        }
        while (j < rightPointer){    // Merge the leftovers from the right side
            intArray[k++] = right[j++];
        }
        return intArray;
    }
}
