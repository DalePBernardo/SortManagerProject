package com.spartaglobal.sortmanagertest.model;

public class MergeSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance() {
        return new MergeSort();
    }
}
