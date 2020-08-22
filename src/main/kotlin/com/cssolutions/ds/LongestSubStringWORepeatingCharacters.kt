package com.cssolutions.ds

fun longestSubString(s: String): Int {

    if (s.isEmpty()) {
        return 0
    }
    var longestSubStringlengthSeenSoFar = 1
    var i = 0
    var j = 1
    while (j < s.length) {
        val charAtJIndex = s[j]
        var subStringLengthSeenHere = j - i + 1
        for (k in j - 1 downTo i) {
            if (charAtJIndex == s[k]) {
                i = k + 1
                subStringLengthSeenHere = j - i + 1
                break
            }
        }
        longestSubStringlengthSeenSoFar = if (subStringLengthSeenHere > longestSubStringlengthSeenSoFar) subStringLengthSeenHere else longestSubStringlengthSeenSoFar
        j++
    }
    return longestSubStringlengthSeenSoFar
}