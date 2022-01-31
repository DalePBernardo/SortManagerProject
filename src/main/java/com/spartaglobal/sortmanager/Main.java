package com.spartaglobal.sortmanager;

public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();

        int[] x = {9, 2, 4, 10, 42, 12, 0, 23};
        int[] y = x.clone();
        x = bs.bubbleSort(x);

        for(int num : x)
            System.out.print(num + " ");
    }
}
