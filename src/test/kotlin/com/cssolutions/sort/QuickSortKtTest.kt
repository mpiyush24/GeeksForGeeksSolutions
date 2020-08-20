package com.cssolutions.sort

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class QuickSortKtTest {

    @Test
    fun quickSortTest() {
        val array = intArrayOf(8,3,4,2,1,5,6,7)
        mergeSort(array)
        for (i in 1 until array.size - 1 )
            assertTrue(array[i-1] < array[i])
    }
}