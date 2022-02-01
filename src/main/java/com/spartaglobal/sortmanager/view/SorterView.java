package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.model.Sorter;

import java.util.Scanner;

public class SorterView {
    public void displayResult(int[] originalArray, Sorter sorter){
        System.out.print("Original Array: ");    // Displaying the original array for comparison
        for (int num : originalArray){
            System.out.print(num + " ");
        }

        int[] sortedArray = sorter.sort(originalArray);    // Sorts the array

        System.out.print("\nSorted Array: ");

        for (int num : sortedArray){    // Prints the sorted array
            System.out.print(num + " ");
        }

        System.out.print("\n");
    }

    public String getDesiredSorter(){
        Scanner sc = new Scanner(System.in);    // Take in user input
        System.out.print("Here are your sorting options:\nBubbleSort\nMergeSort\nEnter your choice: ");
        String desiredSorter = sc.next();
        return desiredSorter;
    }
}
