package com.dbernardo.sortmanager.model;

public class BinarySearchTreeFactory extends SorterFactory {
    @Override
    public Sorter getInstance() {
        return new BinarySearchTree();
    }
}
