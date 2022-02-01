package com.spartaglobal.sortmanagertest.sortmanager.model;

public class BubbleSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance(){
        return new BubbleSort();
    }
}
