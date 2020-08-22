package com.cssolutions.graph

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GraphKtTest {

    @Test
    fun buildGraphTest() {
        val graph = buildGraph(arrayListOf(1,2,3,4,5,6) , arrayListOf(Pair(1,2), Pair(2,3), Pair(3,4), Pair(4,2), Pair(2,1)))
        graph.forEachIndexed { index, edges ->
            run {
                print("$index -->")
                edges.forEach { print("$it -->") }
                println()
            }
        }
    }










}