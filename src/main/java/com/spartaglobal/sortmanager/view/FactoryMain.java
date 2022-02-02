package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.controller.SorterController;
import com.spartaglobal.sortmanager.model.Sorter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMain {
    private static Logger logger = LogManager.getLogger("Sort Controller Logger");

    public static void main(String[] args) {
        SorterView view = new SorterView();
        String desiredSorter = view.getDesiredSorter();    // Get the desired sort method the user wants
        SorterController controller = new SorterController();
        Sorter sorter = controller.getSorter(desiredSorter);
        view.displayResult(controller.initiateArray(sorter, view.getRandomOrInsert()), sorter);    // Display the unsorted and sorted arrays
        logger.info("Results has been displayed to the user");
    }
}
