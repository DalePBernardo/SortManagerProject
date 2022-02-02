package com.spartaglobal.sortmanager.sortfactory;

import com.spartaglobal.sortmanager.model.BubbleSort;

public class BubbleSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance(){
        return new BubbleSort();
    }
}
