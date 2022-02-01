package com.spartaglobal.sortmanager.view;

import com.spartaglobal.sortmanager.controller.SorterController;
import com.spartaglobal.sortmanager.model.Sorter;

public class FactoryMain {
    public static void main(String[] args) {
        SorterView view = new SorterView();
        String desiredSorter = view.getDesiredSorter();
        SorterController controller = new SorterController();
        Sorter sorter = controller.getSorter(desiredSorter);
        view.displayResult(controller.initiateArray(sorter), sorter);
    }
}
