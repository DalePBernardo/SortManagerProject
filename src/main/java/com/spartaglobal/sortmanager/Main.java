package com.spartaglobal.sortmanager;

public class Main {
    public static void main(String[] args) {
        // COPY ARRAY
        BubbleSort bs = new BubbleSort();

        int[] x = {9, 2, 4, 10, 42, 12, 0, 23};
        x = bs.BubbleSort(x);

        for(int num : x)
            System.out.print(num + ", ");
    }
}
