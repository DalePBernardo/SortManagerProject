package com.spartaglobal.sortmanager;

public class MergeSortFactory extends SorterFactory {

    @Override
    public Sorter getInstance() {
        return new MergeSort();
    }
}
