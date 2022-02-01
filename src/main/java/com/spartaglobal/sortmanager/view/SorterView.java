package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.controller.SorterController;
import com.spartaglobal.sortmanager.model.Sorter;

import java.util.Scanner;

public class SorterView {
    public void displayResult(int[] originalArray, Sorter sorter){
        System.out.print("Original Array: ");
        for (int num : originalArray){
            System.out.print(num + " ");
        }

        originalArray = sorter.sort(originalArray, originalArray.length);

        System.out.print("\nSorted Array: ");

        for (int num : originalArray){
            System.out.print(num + " ");
        }

        System.out.print("\n");
    }

    public String getDesiredSorter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Here are your sorting options:\nBubbleSort\nMergeSort\nEnter your choice: ");
        String desiredSorter = sc.next();
        return desiredSorter;
    }
}
