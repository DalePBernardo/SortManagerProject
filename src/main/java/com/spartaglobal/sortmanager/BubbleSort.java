package com.spartaglobal.sortmanager;

public class BubbleSort {

    public static int[] bubbleSort(int[] intArray) {
        if (intArray.length == 0)
            return null;

        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }
}
