package com.cssolutions.graph

import com.cssolutions.model.GraphVertex


public fun createGraph(): Set<GraphVertex> {

    val graphAdajencyList = mutableSetOf<GraphVertex>()
    var graphNodes = mutableListOf<GraphVertex>()

    var vertex1 = GraphVertex(1)
    var vertex2 = GraphVertex(2)
    var vertex3 = GraphVertex(3)
    var vertex4 = GraphVertex(4)
    var vertex5 = GraphVertex(5)
    var vertex6 = GraphVertex(6)
    var vertex7 = GraphVertex(7)
    var vertex8 = GraphVertex(8)

    vertex1.addEdge(vertex2)
    vertex1.addEdge(vertex3)
    vertex1.addEdge(vertex4)
    vertex2.addEdge(vertex5)
    vertex2.addEdge(vertex6)
    vertex3.addEdge(vertex6)
    vertex3.addEdge(vertex7)
    vertex4.addEdge(vertex7)
    vertex4.addEdge(vertex8)
    graphAdajencyList.add(vertex1)
    graphAdajencyList.add(vertex2)
    graphAdajencyList.add(vertex3)
    graphAdajencyList.add(vertex4)
    graphAdajencyList.add(vertex5)
    graphAdajencyList.add(vertex6)
    graphAdajencyList.add(vertex7)
    graphAdajencyList.add(vertex8)

return graphAdajencyList
}