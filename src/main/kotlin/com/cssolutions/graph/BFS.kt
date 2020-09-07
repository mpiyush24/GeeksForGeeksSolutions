package com.cssolutions.graph

import com.cssolutions.model.GraphVertex

public fun BFSUtil() {
    val graph = createGraph()
    bfs(graph = graph.first())
}

fun bfs(graph: GraphVertex) {
    graph.edges.forEach {
        if(!it.processed) {
            print("$it.key - ")
            it.processed = true
        }
    }
    graph.visited = true
    println()
    graph.edges.forEach {
        if(!it.visited) {
            bfs(it)
        }
    }
}

