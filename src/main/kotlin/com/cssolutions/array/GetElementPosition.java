package com.cssolutions.array;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 */
public class GetElementPosition {

    public int[] searchRange(int[] nums, int target) {

        return new int[]{getPosition(nums, target, 0, nums.length-1, true),
                getPosition(nums, target, 0, nums.length-1, false)};

    }

    private int getPosition(int[] nums, int target, int low, int high, boolean isLeft) {

        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(nums[mid] == target) {
            if(isLeft) {
                if(mid == 0) {
                    return mid;
                } else if(nums[mid - 1] != nums[mid]) {
                    return mid;
                }
            } else {
                if(mid == nums.length-1) {
                    return mid;
                } else if(nums[mid+1] != nums[mid]) {
                    return mid;
                }
            }
        }
        return target >= nums[mid]?
                getPosition(nums, target, mid+1, high, isLeft):
                getPosition(nums, target, low, mid-1, isLeft);
    }
}
