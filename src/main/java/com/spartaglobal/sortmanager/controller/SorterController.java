package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.BubbleSortFactory;
import com.spartaglobal.sortmanager.model.MergeSortFactory;
import com.spartaglobal.sortmanager.model.Sorter;
import com.spartaglobal.sortmanager.model.SorterFactory;
import com.spartaglobal.sortmanager.view.SorterView;

import java.util.Random;

public class SorterController {

    public static int[] initiateArray(Sorter sorter, String randomOrInsert){

        SorterView view = new SorterView();

        if (randomOrInsert.toLowerCase().equals("r") || randomOrInsert.toLowerCase().equals("random")){
            Random random = new Random();
            int[] randomIntArray = new int[random.nextInt(0, 15)];    // Randomised size array
            int size = randomIntArray.length;

            for (int i = 0; i < size; i++){
                randomIntArray[i] = random.nextInt(-255, 255);    // Randomised values inserted to the array
            }
            return randomIntArray;

        } else if (randomOrInsert.toLowerCase().equals("i") || randomOrInsert.toLowerCase().equals("insert")){
            int sizeInput = view.getSize();
            int[] generatedArray = new int[sizeInput];

            for (int i = 0; i < sizeInput; i++){
                generatedArray[i] = view.getElement(i);
            }
            return generatedArray;
        } else if (randomOrInsert.toLowerCase().equals("exit"))
            closeApplication("Closing the application...");

        String inputAttempt = view.promptUserInput("\nRandom('r') or insert('i') input not valid, please try again: ");
        return initiateArray(sorter, inputAttempt);
    }

    public static Sorter getSorter(String sorterType){
        SorterFactory sf = null;
        SorterView sv = new SorterView();

        switch (sorterType.toLowerCase()) {    // Check which one the user has entered
            case "bubblesort" -> sf = new BubbleSortFactory();
            case "mergesort" -> sf = new MergeSortFactory();
            case "exit" -> closeApplication("Closing the application...");
            default -> sf = null;
        }

        if (sf == null){
            String desiredSorter = sv.promptUserInput("\nSorter input not valid, please try again: ");
            return getSorter(desiredSorter);
        }

        return sf.getInstance();
    }

    public static void closeApplication(String message){
        System.out.println(message);
        System.exit(0);
    }
}
