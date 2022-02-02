package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.controller.SorterController;
import com.spartaglobal.sortmanager.model.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryMain {
    private static Logger logger = LogManager.getLogger("Sort Logger");

    public static void main(String[] args) {
        SorterView view = new SorterView();
        logger.error("Just created a sorter view object");
        String desiredSorter = view.getDesiredSorter();    // Get the desired sort method the user wants
        SorterController controller = new SorterController();
        Sorter sorter = controller.getSorter(desiredSorter);
        view.displayResult(controller.initiateArray(sorter, view.getRandomOrInsert()), sorter);    // Display the unsorted and sorted arrays
    }
}
