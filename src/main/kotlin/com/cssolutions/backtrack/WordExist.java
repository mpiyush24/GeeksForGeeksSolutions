package com.cssolutions.backtrack;

import java.util.ArrayList;
import java.util.Arrays;

class WordExist {
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length; i ++) {
            for(int j = 0 ; j < board[0].length; j ++ ) {
                if(canWordBeFormed(board, i, j, -1, -1, 0, word, new int[board.length][board[0].length])) {
                    return true;
                }
            }
        }
        return  false;
    }

    public boolean canWordBeFormed(char[][] board, int i, int j, int comingFromI, int comingFromJ, int charIndex, String word, int[][] visitedMap) {

        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || visitedMap[i][j] == 1) {
            return false;
        } else {
            visitedMap[i][j] = 1;
        }
        if (charIndex == word.length()) {
            return true;
        }
        if (word.charAt(charIndex) != board[i][j]) {
            visitedMap[i][j] = 0;
            return false;
        }
        boolean result = word.charAt(charIndex) == board[i][j] &&
                canWordBeFormed(board, i + 1, j, i, j, charIndex + 1, word, visitedMap) ||
                canWordBeFormed(board, i - 1, j, i, j, charIndex + 1, word, visitedMap) ||
                canWordBeFormed(board, i, j + 1, i, j, charIndex + 1, word, visitedMap) ||
                canWordBeFormed(board, i, j - 1, i, j, charIndex + 1, word, visitedMap);

        if (!result) {
            visitedMap[i][j] = 0;
            return false;
        }
        return true;
    }
}
