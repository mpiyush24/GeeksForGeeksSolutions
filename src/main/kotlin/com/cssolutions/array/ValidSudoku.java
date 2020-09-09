package com.cssolutions.array;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer,Integer> numFreqMap = new HashMap<>();
        for(int i = 0 ; i < 9 ; i ++ ) {
            boolean isValid;
            for(int j =0 ; j < 9 ; j ++) {
                if(board[i][j] == '.') {
                    continue;
                }
                int val = Integer.parseInt(String.valueOf(board[i][j]));
                if(numFreqMap.containsKey(val)) {
                    return false;
                } else {
                    numFreqMap.put(val, 1);
                }
            }
            isValid = numFreqMap.values().stream().noneMatch(x-> x > 1);
            if(!isValid) {
                return false;
            }
            numFreqMap.clear();
        }

        for(int j = 0 ; j < 9 ; j ++ ) {
            boolean isValid;
            for(int i =0 ; i < 9 ; i ++) {
                if(board[i][j] == '.') {
                    continue;
                }
                int val = Integer.parseInt(String.valueOf(board[i][j]));
                if(numFreqMap.containsKey(val)) {
                    return false;
                } else {
                    numFreqMap.put(val, 1);
                }
            }
            isValid = numFreqMap.values().stream().noneMatch(x-> x > 1);
            if(!isValid) {
                return false;
            }
            numFreqMap.clear();
        }

        for(int i = 0 ; i < 9 ; i +=3 ) {
            for(int j =0 ; j < 9 ; j +=3) {
                boolean isValidBox;
                for(int k = i ; k < i+3; k ++) {
                    for(int l = j ; l < j+3; l++) {
                        if(board[k][l] == '.') {
                            continue;
                        }
                        int val = Integer.parseInt(String.valueOf(board[k][l]));
                        if(numFreqMap.containsKey(val)) {
                            return false;
                        } else {
                            numFreqMap.put(val, 1);
                        }
                    }
                }
                isValidBox = numFreqMap.values().stream().noneMatch(x-> x > 1);
                if(!isValidBox) {
                    return false;
                }
                numFreqMap.clear();
            }
        }
        return true;
    }
}
