package com.spartaglobal.sortmanager;

public class BubbleSort implements Sorter {

    public int[] sort(int[] intArray, int size) {
        if (intArray.length == 0 || size <= 0)    // Returns null if the array is empty
            return null;

        for (int i = 0; i < intArray.length - 1; i++) {    // Go through the array element by element
            for (int j = 0; j < intArray.length - i - 1; j++) {    // Compare it to its right each iteration
                if (intArray[j] > intArray[j + 1]) {    // Swap if they are the other way around
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }
}
