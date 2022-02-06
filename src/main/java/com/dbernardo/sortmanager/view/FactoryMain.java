package com.dbernardo.sortmanager.view;

import com.dbernardo.sortmanager.controller.SorterController;
import com.dbernardo.sortmanager.model.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMain {
    private static Logger logger = LogManager.getLogger(FactoryMain.class.getSimpleName());    // Logger for user activities

    public static void main(String[] args) {
        while (true){
            SorterView view = new SorterView();
            SorterController controller = new SorterController();

            view.displayAppTitle();    // Displays the project title

            Sorter sorter = controller.getSorter(view.getDesiredSorter());    // Gets the sorting method and randomise or insert the array input

            // Prompts user to choose whether to randomise or insert the array then display the original and sorted array
            view.displayResult(controller.initiateArray(sorter, view.getRandomOrInsert()), sorter);

            logger.info("Results has been displayed to the user");
            controller.userTryAgain();    // Asks if the user would like to try again
        }
    }
}
