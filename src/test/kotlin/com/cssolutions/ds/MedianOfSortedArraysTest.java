package com.cssolutions.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfSortedArraysTest {

    @Test
    void findMedianSortedArraysTest() {
        double median = new MedianOfSortedArrays().findMedianSortedArrays(new int[]{1,2}, new int[]{3,4});
        assertEquals(median,2.5);
    }
}