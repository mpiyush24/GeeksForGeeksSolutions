package com.cssolutions.ds;

public class LongestPalindromicSubString {

    public String longestPalindromicSubString(String s) {
        if(s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0 ;
        for( int i = 0 ; i < s.length(); i ++) {
            int len1 = longestPalindrome( s, i, i);
            int len2 = longestPalindrome( s, i, i + 1);
            int len = Math.max(len1,len2);
            if(len > end - start) {
                start = i - (len -1) / 2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private int longestPalindrome(String s, int left , int right) {

        if( s== null || left > right) {
            return 0;
        }
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
         left--;
         right++;
        }
        return (right - 1)  - (left + 1 )  + 1;
    }


}
