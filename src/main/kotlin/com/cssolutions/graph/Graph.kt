package com.cssolutions.graph


fun buildGraph(vertices: List<Int>, edges: List<Pair<Int, Int>>): MutableList<MutableSet<Int>> {
    val graph = MutableList(vertices.max()?:0){ mutableSetOf<Int>() }
    edges.forEach { addEdge(graph, it) }
    return graph
}

private fun addEdge(graph: MutableList<MutableSet<Int>> , edge: Pair<Int, Int>) {
    graph[edge.first].add(edge.second)
    graph[edge.second].add(edge.first)
}