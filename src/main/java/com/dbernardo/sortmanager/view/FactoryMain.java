package com.dbernardo.sortmanager.view;

import com.dbernardo.sortmanager.controller.SorterController;
import com.dbernardo.sortmanager.model.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMain {
    private static Logger logger = LogManager.getLogger(FactoryMain.class.getSimpleName());    // Logger for user activities

    public static void main(String[] args) {
        SorterView view = new SorterView();
        view.displayAppTitle();    // Displays the project title
        String desiredSorter = view.getDesiredSorter();    // Get the desired sort method the user wants
        SorterController controller = new SorterController();
        Sorter sorter = controller.getSorter(desiredSorter);
        // Prompts user to choose whether to randomise or insert the array then display the original and sorted array
        view.displayResult(controller.initiateArray(sorter, view.getRandomOrInsert()), sorter);
        logger.info("Results has been displayed to the user");
    }
}
