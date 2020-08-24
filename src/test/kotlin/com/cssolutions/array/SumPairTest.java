package com.cssolutions.array;

import kotlin.Pair;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumPairTest {

    @Test
    void sumPairTestSquare() { // O(n^2) Solution
        List<Pair<Integer, Integer>> response = new SumPair(List.of(-2, -1, 0, 1, 2, 3), 1).sumPairNSquareComplexity();
        response.forEach(pair ->
                assertEquals(pair.getFirst() + pair.getSecond(), 1));
    }

    @Test
    void sumPairTestNLogN() { // O(nlogn) solution

        List<Integer> input = new ArrayList<>();
        input.add(-2);input.add(-1);input.add(0);input.add(1);input.add(2);input.add(3);

        List<Pair<Integer, Integer>> response = new SumPair(input, 1).sumPairNLogNComplexity();
        response.forEach(pair ->
                assertEquals(pair.getFirst() + pair.getSecond(), 1));
    }

    @Test
    void sumPairTestNComplexity() { // O(nlogn) solution

        List<Integer> input = new ArrayList<>();
        input.add(-2);input.add(-1);input.add(0);input.add(1);input.add(2);input.add(3);

        List<Pair<Integer, Integer>> response = new SumPair(input, 1).sumPairNComplexity();
        response.forEach(pair ->
                assertEquals(pair.getFirst() + pair.getSecond(), 1));
    }
}