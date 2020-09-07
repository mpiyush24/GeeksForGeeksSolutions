package com.cssolutions.backtrack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordExistTest {

    @Test
    void existTest() {
        
        char[][] input = new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        System.out.println(new WordExist().exist(input, "ABCCED"));
    }

    @Test
    void roughTest() {
        System.out.println(Arrays.asList(new int[]{1,2,3,4}));
    }
}