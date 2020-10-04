package com.cssolutions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeKList {
    public static List<Integer>  mergeKListInMemory(List<List<Integer>> kLists) {

        List<Integer> output = new ArrayList<>();

        List<Integer> kListPos = new ArrayList<>();

        for( int i = 0 ; i < kLists.size(); i++)
        {
            kListPos.add(0); // Initialise the array with 0th Index; [0,0,1]
        }

        while(isListMergeComplete(kListPos, kLists.get(0).size())) {

            List<Integer> valToCompare = new ArrayList<>();

            for(int k = 0 ; k < kLists.size(); k++) {
                if(kListPos.get(k) > kLists.size() - 1) {
                    valToCompare.add(Integer.MAX_VALUE);
                } else {
                    valToCompare.add(kLists.get(k).get(kListPos.get(k)));
                }
            }

            List<Integer> maxValIndexPair = getMinFromList(valToCompare, kListPos);//  (1,0)
            if(maxValIndexPair.get(0) == -1) {
                continue;
            }
            int idxToIncrement = kListPos.get(maxValIndexPair.get(0));
            kListPos.set(maxValIndexPair.get(0), ++idxToIncrement);
            output.add(maxValIndexPair.get(1));
        }
        return output;
    }

    private static List<Integer> getMinFromList (List<Integer> valToCompare, List<Integer> kListPos) {

        int minValListIndex = -1;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < valToCompare.size(); i ++) {

            if(valToCompare.get(i) < minValue) {

                minValue = valToCompare.get(i);
                minValListIndex = i;
            }
        }
        return Arrays.asList(minValListIndex, minValue);
    }


    private static boolean isListMergeComplete(List<Integer> kListPos, int listSize) { // listSize == 4

        int listToComplete = kListPos.size();

        int countOfListCompleted = 0 ;

        for(int i =0 ; i < kListPos.size(); i++) {

            if(kListPos.get(i) == listSize -1) { // Handle Index with -1
                countOfListCompleted++;
            }

        }

        return !(countOfListCompleted == listToComplete);
    }

}
/*
Your previous Plain Text content is preserved below:

This is just a simple shared plaintext pad, with no execution capabilities.

When you know what language you'd like to use for your interview,
simply choose it from the dropdown in the top bar.

You can also change the default language your pads are created with
in your account settings: https://coderpad.io/settings

Enjoy your interview!

Input: k = 3, n =  4
k = number of lists
n = number of elements in each list

sorted array lists, give globally sorted output
list1 = 1,3,5,7
list2 = 2,4,6,8
list3 = 0,9,10,11

Output: 0,1,2,3,4,5,6,7,8,9,10,11

Time Complexity :
 */
