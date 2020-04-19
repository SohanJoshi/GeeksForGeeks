package com.easy;

public class FindWordsThatCanBeFormedByCharacters_1160 {
    public int countCharacters(String[] words, String chars) {
        int result = 0;

        int[] charFreq = new int[26];
        for(char c : chars.toCharArray())
            charFreq[c - 'a'] ++;

        for(String word : words) {
            if (isGood(word, charFreq))
                result += word.length();
        }
        return result;
    }

    private boolean isGood(String word, int[] charFreq) {
        int[] wordFreq = new int[26];

        for(char c : word.toCharArray()) {
            int charInt = c - 'a';
            wordFreq[charInt] ++;
            if(wordFreq[charInt] > charFreq[charInt])
                return false;
        }

        return true;
    }
}
