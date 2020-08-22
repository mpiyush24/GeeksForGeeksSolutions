package com.cssolutions.ds


fun countSubstrings(s: String?): Int {
    if (s == null) {
        return 0
    }
    var count = 0
    for (i in s.indices) {
        count += longestPalindrome(s, i, i) + longestPalindrome(s, i, i + 1)
    }
    return count
}

private fun longestPalindrome(s: String?, left: Int, right: Int): Int {
    var left = left
    var right = right
    if (s == null || left > right) {
        return 0
    }
    var count = 0
    while (left >= 0 && right < s.length && s[left] == s[right]) {
        count++
        left--
        right++
    }
    return count
}