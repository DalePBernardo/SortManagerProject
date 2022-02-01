package com.spartaglobal.sortmanager;

import java.util.Random;
import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Here are your sorting options:\nBubbleSort\nMergeSort\nEnter your choice: ");
        String desiredSorter = sc.next();
        Sorter sorter = getSorter(desiredSorter);

        System.out.println("You have chosen: " + sorter.getClass().getSimpleName());

        Random random = new Random();
        int[] randomIntArray = new int[random.nextInt(0, 25)];
        int size = randomIntArray.length;

        for (int i = 0; i < size; i++){
            randomIntArray[i] = random.nextInt(-255, 255);
        }

        System.out.print("Original Array: ");
        for (int num : randomIntArray){
            System.out.print(num + " ");
        }

        randomIntArray = sorter.sort(randomIntArray, randomIntArray.length);

        System.out.print("\nSorted Array: ");

        for (int num : randomIntArray){
            System.out.print(num + " ");
        }
    }

    public static Sorter getSorter(String sorterType){
        SorterFactory sf;
        switch (sorterType) {
            case "BubbleSort":
                sf = new BubbleSortFactory();
                break;
            case "MergeSort":
                sf = new MergeSortFactory();
                break;
            default: sf = null;
        }
        return sf.getInstance();
    }
}
