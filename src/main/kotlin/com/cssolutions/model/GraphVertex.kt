package com.cssolutions.model


data class GraphVertex(val key: Int,
                       var visited: Boolean = false,
                       var processed: Boolean = false): Comparable<GraphVertex> {

    var edges: MutableSet<GraphVertex> = mutableSetOf()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GraphVertex

        if (key != other.key) return false
        if (visited != other.visited) return false
        if (edges != other.edges) return false

        return true
    }

    override fun hashCode(): Int {
        var result = key
        return result
    }

    override fun compareTo(other: GraphVertex): Int {
        return when {
            this.key == other.key -> {
                0
            }
            this.key < other.key -> {
                -1
            }
            else -> {
                1
            }
        }
    }

    public fun addEdge(grapNode: GraphVertex) {
        this.edges.add(grapNode);
        grapNode.edges.add(this)
    }
}