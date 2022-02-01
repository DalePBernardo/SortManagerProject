package com.spartaglobal.sortmanager;

public class BubbleSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance(){
        return new BubbleSort();
    }
}
