package com.dbernardo.sortmanagertest;

import com.dbernardo.sortmanager.controller.SorterController;
import com.dbernardo.sortmanager.model.BubbleSort;
import com.dbernardo.sortmanager.model.MergeSort;
import com.dbernardo.sortmanager.model.Sorter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SorterControllerTest {
    private static SorterController sut;
    private static Sorter sorter;
    
    @BeforeAll
    static void setUp(){
        sut = new SorterController();
        sorter = new MergeSort();
    }
    
    @Test
    @DisplayName("Given a random array, Initiate array should return a non-null array")
    public void givenRandomArray_InitiateArray_ReturnsANonNullArray(){
        boolean isNotNull = false;
        int[] testArray = sut.initiateArray(sorter, "random");
        if (testArray != null || testArray.length == 0)
            isNotNull = true;
        assertEquals(true, isNotNull);
    }

    @Test
    @DisplayName("Given a random array, Initiate array should return an array that has a size within the range")
    public void givenRandomArray_InitiateArray_ReturnsAnArrayWithSizeOfTheRange(){
        boolean isInRange = false;
        int[] testArray = sut.initiateArray(sorter, "random");
        if (testArray.length >= 10 && testArray.length <= 25)
            isInRange = true;
        assertEquals(true, isInRange);
    }

    @Test
    @DisplayName("Given a random array, Initiate array should return an array only of integers")
    public void givenRandomArray_InitiateArray_ReturnsAnArrayWithOnlyIntegers(){
        boolean isAllIntegers = true;
        int[] testArray = sut.initiateArray(sorter, "random");
        for (int num: testArray){
            if (!String.valueOf(num).matches("-?[0-9]{0,10}"))
                isAllIntegers = false;
        }
        assertEquals(true, isAllIntegers);
    }

    @Test
    @DisplayName("Given a sorter that is provided to be merge sort, getSorter is expected to return a merge sort sorter")
    public void givenAMergeSorter_GetSorter_ShouldReturnMergeSorter(){
        Sorter sortingMethod = sut.getSorter("MergeSort");
        assertEquals("MergeSort", sortingMethod.getClass().getSimpleName());
    }
}
