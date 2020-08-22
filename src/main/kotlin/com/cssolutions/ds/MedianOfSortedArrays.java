package com.cssolutions.ds;

class MedianOfSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalSize = nums1.length + nums2.length;
        boolean isEvenSize = totalSize % 2 == 0 ;
        int medianElementIndex = (totalSize - 1)/2 ;
        int i = 0 ;
        int j = 0 ;
        int k = 0;
        int[] mergedArray = new int[totalSize];
        while( i< nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                mergedArray[k] = nums1[i];
                i ++;
            } else {
                mergedArray[k] = nums2[j];
                j ++;
            }
            k++;
        }
        while ( i < nums1.length) {
            mergedArray[k] = nums1[i];
            i++ ;k++;
        }
        while ( j < nums2.length) {
            mergedArray[k] = nums2[j];
            j++ ;k++;
        }
        return isEvenSize? ((float)(mergedArray[medianElementIndex] + mergedArray[medianElementIndex + 1])) /2.0 : mergedArray[medianElementIndex];
    }
}