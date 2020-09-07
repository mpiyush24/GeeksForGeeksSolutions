package com.cssolutions.graph;

import com.cssolutions.model.GraphVertex;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

public class GraphTraversals {

    public Set<GraphVertex> bfsTraversal(GraphVertex graphVertex) {

        Set<GraphVertex> bfsTraversal = new HashSet<>();
        Queue<GraphVertex> queue = new ArrayDeque<>();

        queue.add(graphVertex);

        while (!queue.isEmpty()) {
            GraphVertex g = queue.poll();
            g.setVisited(true);
            bfsTraversal.add(g);
            queue.addAll(g.getEdges().stream().filter(e -> !e.getVisited()).collect(Collectors.toList()));
        }

        return bfsTraversal;
    }
}
