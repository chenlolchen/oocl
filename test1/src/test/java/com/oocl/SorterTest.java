package com.oocl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SorterTest {
    private static Sorter sorter;
    private int[] data = new int[9];
    private int[] data1 = {6, 2, 9, 12, 3, 4, 8, 7};

    @BeforeClass
    public static void init(){
        sorter = new Sorter();
    }

    @Before
    public void start(){
        data[0] = 6;
        data[1] = 2;
        data[2] = 9;
        data[3] = 12;
        data[4] = 3;
        data[5] = 4;
        data[6] = 8;
        data[7] = 77;
        data[8] = 7;
    }

    @Test
    public void selectSort() throws Exception {
        sorter.selectSort(data);
        Assert.assertTrue(data[0] == 2);
        Assert.assertTrue(data[8] == 77);
    }

    @Test
    public void bubbleSort() throws Exception {
        sorter.bubbleSort(data);
        Assert.assertTrue(data[0] == 2);
        Assert.assertTrue(data[8] == 77);
    }

    @Test
    public void binarySearch() throws Exception {
        int sort_data = sorter.binarySearch(12, data1);
        Assert.assertTrue(sort_data == 12);
    }

}