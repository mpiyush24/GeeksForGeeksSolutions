package com.cssolutions.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupStringTest {

    @Test
    void groupAnagrams() {
        List<List<String>> res = new GroupString().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        System.out.println(res);
    }
}