package com.cssolutions.ds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubStringTest {

    @Test
    void longestPalindromicSubStringTest() {
        String palindromicSubString = new LongestPalindromicSubString().longestPalindromicSubString("racecar");
        assertEquals("racecar", palindromicSubString);
    }
}