package com.spartaglobal.sortmanager;

public class MergeSort {

    public static int[] mergeSort(int[] intList, int n){
        if (n < 2)
            return null;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++){
            left[i] = intList[i];
        }

        for(int i = mid; i < n; i++){
            right[i - mid] = intList[i];
        }

        mergeSort(left, mid);
        mergeSort(right, n - mid);

        return merge(intList, left, right, mid, n - mid);
    }

    public static int[] merge(int[] intList, int[] left, int[] right, int leftPointer, int rightPointer){
        int i = 0, j = 0, k = 0;
        while(i < leftPointer && j < rightPointer){
            if (left[i] <= right[j]) {
                intList[k++] = left[i++];
            } else {
                intList[k++] = right[j++];
            }
        }
        while (i < leftPointer){
            intList[k++] = left[i++];
        }
        while (j < rightPointer){
            intList[k++] = right[j++];
        }

        return intList;
    }
}
