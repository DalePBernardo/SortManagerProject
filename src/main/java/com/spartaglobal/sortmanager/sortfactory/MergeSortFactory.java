package com.spartaglobal.sortmanager.sortfactory;

import com.spartaglobal.sortmanager.model.MergeSort;

public class MergeSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance() {
        return new MergeSort();
    }
}
