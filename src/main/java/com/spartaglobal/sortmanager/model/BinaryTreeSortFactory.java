package com.spartaglobal.sortmanager.model;

public class BinaryTreeSortFactory extends SorterFactory {
    @Override
    public Sorter getInstance() {
        return new BinaryTreeSort();
    }
}
