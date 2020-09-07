package com.cssolutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TripletSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> triplets = new HashSet<>();
        if (nums.length < 3) return Collections.emptyList();
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sumAtThisPass = nums[i] + nums[j] + nums[k];
                if (nums[i] + nums[j] + nums[k] == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sumAtThisPass > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(triplets);
    }
}