package com.dbernardo.sortmanager.model;

public class MergeSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance() {
        return new MergeSort();
    }
}
