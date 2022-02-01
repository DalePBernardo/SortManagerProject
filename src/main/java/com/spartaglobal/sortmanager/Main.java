package com.spartaglobal.sortmanager;

public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        MergeSort ms = new MergeSort();

        int[] x = {9, 2, 4, 10, 42, 12, 0, 23};
        System.out.print("Unsorted Array: ");

        for (int num : x){
            System.out.print(num + " ");
        }

        int[] y = x.clone();
        x = bs.bubbleSort(x);
        y = ms.mergeSort(y, 8);


        System.out.print("\nBubble Sorted: ");

        for(int num : x)
            System.out.print(num + " ");

        System.out.print("\nMerge Sorted: ");

        for(int num : y)
            System.out.print(num + " ");
    }
}
