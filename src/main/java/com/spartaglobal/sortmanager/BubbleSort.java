package com.spartaglobal.sortmanager;

public class BubbleSort {
    public int[] BubbleSort(int[] intArray){
        for (int i = 0; i < intArray.length - 1; i++){
            for (int j = 0; j < intArray.length - i - 1; j++){
                if (intArray[j] > intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        return intArray;
    }
}
