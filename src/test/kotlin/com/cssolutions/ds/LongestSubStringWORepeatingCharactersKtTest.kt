package com.cssolutions.ds

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class LongestSubStringWORepeatingCharactersKtTest {

    @Test
    fun longestSubStringTest() {
        val longestSubStringLength = longestSubString("bbbbbb")
        assertEquals(longestSubStringLength, 1)
    }
}