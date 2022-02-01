package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.controller.SorterController;
import com.spartaglobal.sortmanager.model.Sorter;

public class FactoryMain {
    public static void main(String[] args) {
        SorterView view = new SorterView();
        String desiredSorter = view.getDesiredSorter();    // Get the desired sort method the user wants
        SorterController controller = new SorterController();
        Sorter sorter = controller.getSorter(desiredSorter);
        view.displayResult(controller.initiateArray(sorter), sorter);    // Display the unsorted and sorted arrays
    }
}
