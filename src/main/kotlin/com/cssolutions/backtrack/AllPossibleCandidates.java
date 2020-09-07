package com.cssolutions.backtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPossibleCandidates {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        getCandidatesEqualSum(candidates,new ArrayList<Integer>(), 0, target, result);
        return new ArrayList(result);
    }

    public void getCandidatesEqualSum(int[] candidates, List<Integer> sum,
                                      int can_idx, int reqTarget,Set<List<Integer>> result) {
        if(reqTarget == 0 ) {
            addToResultArray(result, new ArrayList<>(sum));
            return;
        }

        if(can_idx == candidates.length || reqTarget < 0) {
            return;
        }

        sum.add(candidates[can_idx]);
        getCandidatesEqualSum(candidates,sum,can_idx, reqTarget - candidates[can_idx], result);
        sum.remove(sum.size() - 1);
        getCandidatesEqualSum(candidates ,sum ,can_idx+1 , reqTarget, result);
    }

    private void addToResultArray(Set<List<Integer>> result, List<Integer> ints){
        Collections.sort(ints);
        result.add(ints);
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        getCandidatesEqualSum(candidates,new int[candidates.length], 0, 0, target, result);
        return new ArrayList(result);
    }

    public void getCandidatesEqualSum(int[] candidates, int[] sum,
                                      int can_idx, int sum_idx,
                                      int reqTarget,Set<List<Integer>> result) {
        if(reqTarget == 0 ) {
            addToResultArray(result, sum);
            return;
        }

        if(can_idx == candidates.length || reqTarget < 0) {
            return;
        }

        sum[sum_idx] = candidates[can_idx];
        getCandidatesEqualSum(candidates,sum,can_idx+1,sum_idx+1, reqTarget - candidates[can_idx], result);
        sum[sum_idx] = 0 ;
        getCandidatesEqualSum(candidates ,sum ,can_idx+1 , sum_idx, reqTarget, result);
    }

    private void addToResultArray(Set<List<Integer>> result, int[] ints){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : ints)
        { if(i != 0 )
            intList.add(i);
        }
        Collections.sort(intList);
        result.add(intList);
    }
}
