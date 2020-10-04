package com.cssolutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupString {

    public List<List<String>> groupAnagrams(String[] strs) {

        String[] tempArray  = new String[strs.length];

        Map<String, List<String>> result = new HashMap<>();

        for(int i = 0  ; i < strs.length ;i++) {
            tempArray[i] = sortedString(strs[i]);
        }

        for(int i = 0 ; i < tempArray.length; i++) {
            if(result.get(tempArray[i]) != null) {
                result.get(tempArray[i]).add(strs[i]);
            } else {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                result.put(tempArray[i],group);
            }
        }

        return new ArrayList<>(result.values());
    }

    public String sortedString(String s) {

        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);

        return new String(charArray);

    }
}
