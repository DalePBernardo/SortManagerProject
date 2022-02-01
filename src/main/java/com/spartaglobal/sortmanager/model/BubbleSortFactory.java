package com.spartaglobal.sortmanager.model;

public class BubbleSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance(){
        return new BubbleSort();
    }
}
