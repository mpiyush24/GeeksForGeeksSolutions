package com.cssolutions.graph

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GraphKtTest {

    @Test
    fun buildGraphTest() {
        val graph = createGraph()
        //BFSUtil()
        GraphTraversals().bfsTraversal(graph.first())
    }










}