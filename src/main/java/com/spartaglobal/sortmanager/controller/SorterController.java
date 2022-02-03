package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.*;
import com.spartaglobal.sortmanager.view.SorterView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class SorterController {
    private static Logger logger = LogManager.getLogger(SorterController.class.getSimpleName());

    public static int[] initiateArray(Sorter sorter, String randomOrInsert){

        SorterView view = new SorterView();

        if (randomOrInsert.toLowerCase().equals("r") || randomOrInsert.toLowerCase().equals("random")){
            logger.info("User chose to randomise the array");
            Random random = new Random();
            int[] randomIntArray = new int[random.nextInt(10, 25)];    // Randomised size array
            int size = randomIntArray.length;

            for (int i = 0; i < size; i++){
                randomIntArray[i] = random.nextInt(-255, 255);    // Randomised values inserted to the array
            }
            return randomIntArray;

        } else if (randomOrInsert.toLowerCase().equals("i") || randomOrInsert.toLowerCase().equals("insert")){
            logger.info("User chose to insert the array");

            int sizeInput = view.getSize();
            int[] generatedArray = new int[sizeInput];
            logger.info("User has entered the size for the array");

            for (int i = 0; i < sizeInput; i++){
                generatedArray[i] = view.getElement(i);
            }
            logger.info("User has inputted all of the values for the array");

            return generatedArray;
        } else if (randomOrInsert.toLowerCase().equals("exit")){
            closeApplication("\nClosing the application...");
        }

        logger.warn("User entered an invalid input when choosing randomise or insert the array");
        String inputAttempt = view.promptUserInput("\nRandom('r') or insert('i') input not valid, please try again: ");
        return initiateArray(sorter, inputAttempt);
    }

    public static Sorter getSorter (String sorterType) {
        SorterFactory sf = null;
        SorterView sv = new SorterView();

        switch (sorterType.toLowerCase()) {    // Check which one the user has entered
            case "bubblesort", "bs":
                logger.info("User chose Bubble sort to sort the array");
                sf = new BubbleSortFactory();
                break;
            case "mergesort", "ms":
                logger.info("User chose Merge sort to sort the array");
                sf = new MergeSortFactory();
                break;
            case "binarysearchtree", "bst":
                logger.info("User chose Binary tree sort to sort the array");
                sf = new BinarySearchTreeFactory();
                break;
            case "exit":
                closeApplication("\nClosing the application...");
            default:
                logger.warn("User entered an invalid input when choosing the sorter");
                sf = null;
        }

        if (sf == null){
            String desiredSorter = sv.promptUserInput("\nSorter input not valid, please try again: ");
            return getSorter(desiredSorter);
        }

        return sf.getInstance();
    }

    public static void closeApplication(String message){
        logger.info("User wishes to exit the application");
        System.out.println(message);
        System.exit(0);
    }
}
