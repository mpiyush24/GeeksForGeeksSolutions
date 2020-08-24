package com.cssolutions.array;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SumPair {
    private final List<Integer> input;
    private final int sum;
    private final HashMap<Integer, List<Integer>> sumDeltaMap;

    public SumPair(List<Integer> input,int sum) {
        this.input = input;
        this.sum = sum;
        this.sumDeltaMap = createSumDeltaMap();
    }

    public List<Pair<Integer, Integer>> sumPairNSquareComplexity() { // O(n^2) solution
        List<Pair<Integer, Integer>> pairSumList = new ArrayList<>();
        for (int i = 0; i < input.size() - 1; i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i) + input.get(j) == sum) {
                    pairSumList.add(new Pair(input.get(i), input.get(j)));
                }
            }
        }
        return pairSumList;
    }

    public List<Pair<Integer, Integer>> sumPairNLogNComplexity() { // O(n^2) solution

        List<Pair<Integer, Integer>> pairSumList = new ArrayList<>();
        Collections.sort(input);
        int i = 0;
        int j = input.size() - 1;

        while (i < j) {
            int sumAtThisPass = input.get(i) + input.get(j);
            if (sumAtThisPass == sum) {
                pairSumList.add(new Pair(input.get(i), input.get(j)));
                i++;
                j--;
            } else if (sumAtThisPass > sum) {
                j--;
            } else {
                i++;
            }
        }
        return pairSumList;
    }

    public List<Pair<Integer, Integer>> sumPairNComplexity() {
        List<Pair<Integer, Integer>> result = new ArrayList<>();
        for(int i = 0; i < input.size(); i++) {
            List<Integer> indexListOfNumbersWithSum = getSecondNumberIndexFromInputArrayWhichCanFormTheSumExcludingFirstNumber(i);
            if(!(indexListOfNumbersWithSum == null || indexListOfNumbersWithSum.isEmpty())) {
                for (int secondNumberIndex : indexListOfNumbersWithSum) {
                    result.add(new Pair<>(input.get(i), input.get(secondNumberIndex)));
                }
            }
        }
        return result;
    }

    private HashMap<Integer, List<Integer>> createSumDeltaMap() {
        HashMap<Integer, List<Integer>> sumDeltaMap = new HashMap<>();
        for (int i = 0; i < input.size(); i++) { // O(N)
            int delta = sum - input.get(i);
            if (sumDeltaMap.containsKey(delta)) {
                sumDeltaMap.get(delta).add(i);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                sumDeltaMap.put(delta, indexList);
            }
        }
        return sumDeltaMap;
    }

    private List<Integer> getSecondNumberIndexFromInputArrayWhichCanFormTheSumExcludingFirstNumber(int firstNumberIndex) {
        List<Integer> indexListOfNumbersWithSum = sumDeltaMap.get(input.get(firstNumberIndex));
        return (indexListOfNumbersWithSum == null || indexListOfNumbersWithSum.isEmpty())? null :
                indexListOfNumbersWithSum.stream().filter(it -> it != firstNumberIndex).collect(Collectors.toList());
    }

}

