package com.cssolutions.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeKListTest {

    @Test
    void mergeKListInMemoryTest() {

        List<Integer> output = MergeKList.mergeKListInMemory(Arrays.asList(
                Arrays.asList(1,3,5,7),
                Arrays.asList(2,4,6,8),
                Arrays.asList(0,9,10,11)
        ));

        System.out.printf(output.toString());
    }
}