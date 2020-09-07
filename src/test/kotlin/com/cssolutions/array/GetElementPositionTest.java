package com.cssolutions.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetElementPositionTest {

    @Test
    void searchRangeTest() {
        int[] response = new GetElementPosition().searchRange(new int[]{2,2}, 2);
        System.out.println(response);
    }
}