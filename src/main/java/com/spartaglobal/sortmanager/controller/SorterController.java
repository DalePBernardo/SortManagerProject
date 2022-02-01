package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.BubbleSortFactory;
import com.spartaglobal.sortmanager.model.MergeSortFactory;
import com.spartaglobal.sortmanager.model.Sorter;
import com.spartaglobal.sortmanager.model.SorterFactory;

import java.util.Locale;
import java.util.Random;

public class SorterController {

    public static int[] initiateArray(Sorter sorter){

        System.out.println("\nYou have chosen: " + sorter.getClass().getSimpleName());

        Random random = new Random();
        int[] randomIntArray = new int[random.nextInt(0, 25)];
        int size = randomIntArray.length;

        for (int i = 0; i < size; i++){
            randomIntArray[i] = random.nextInt(-255, 255);
        }

        return randomIntArray;
    }

    public static Sorter getSorter(String sorterType){
        SorterFactory sf;
        switch (sorterType.toLowerCase()) {
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
