package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.model.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SorterView {

    private static Logger logger = LogManager.getLogger("Sort Controller Logger");

    public void displayResult(int[] originalArray, Sorter sorter){

        System.out.println("\nYou have chosen: " + sorter.getClass().getSimpleName());

        System.out.print("\nOriginal Array: ");    // Displaying the original array for comparison
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

    public String getRandomOrInsert(){
        return promptUserInput("\nHere are your generating array options:\n" +
                "|---------Random(r)----------|\n|---------Insert(i)----------|" +
                "\n|------------Exit------------|\nEnter your choice: ");
    }

    public String getDesiredSorter(){
        return promptUserInput("\nHere are your sorting options:\n" +
                "|---------BubbleSort---------|\n|---------MergeSort----------|" +
                "\n|------------Exit------------|\nEnter your choice: ");
    }

    public int getSize(){
        try{
            return promptUserIntInput("\nPlease enter the size of the desired array: ");
        } catch (InputMismatchException ime) {
            logger.info("User entered an invalid input for choosing the size of the array");

            System.out.print("\nNumber entered not recognised, try again");
            return getSize();
        }
    }

    public int getElement(int index){
        try{
            return promptUserIntInput("\nEnter a number for position " + (index + 1) + ": ");
        } catch (InputMismatchException ime){
            logger.info("User entered an invalid input for inputting elements in the array");
            System.out.print("\nNumber entered not recognised, try again");
            return getElement(index);
        }
    }

    public String promptUserInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.next();
    }

    public int promptUserIntInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        return sc.nextInt();
    }
}
