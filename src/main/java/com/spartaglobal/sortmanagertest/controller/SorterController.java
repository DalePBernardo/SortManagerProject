package com.spartaglobal.sortmanagertest.controller;

import com.spartaglobal.sortmanagertest.model.BubbleSortFactory;
import com.spartaglobal.sortmanagertest.model.MergeSortFactory;
import com.spartaglobal.sortmanagertest.model.Sorter;
import com.spartaglobal.sortmanagertest.model.SorterFactory;

import java.util.Random;

public class SorterController {

    public static int[] initiateArray(Sorter sorter){

        System.out.println("\nYou have chosen: " + sorter.getClass().getSimpleName());    // Informing the user which one they have chosen

        Random random = new Random();
        int[] randomIntArray = new int[random.nextInt(0, 25)];    // Randomised size array
        int size = randomIntArray.length;

        for (int i = 0; i < size; i++){
            randomIntArray[i] = random.nextInt(-255, 255);    // Randomised values inserted to the array
        }

        return randomIntArray;
    }

    public static Sorter getSorter(String sorterType){
        SorterFactory sf;
        switch (sorterType.toLowerCase()) {    // Check which one the user has entered
            case "bubblesort":
                sf = new BubbleSortFactory();
                break;
            case "mergesort":
                sf = new MergeSortFactory();
                break;
            default: sf = null;
        }
        return sf.getInstance();
    }
}
