package com.thirtydayleetcoding.may2020.week1;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] note = new char[26];
        char[] maga = new char[26];

        for(char m : magazine.toCharArray())
            maga[m - 'a'] ++;

        for(char n : ransomNote.toCharArray())
            note[n - 'a'] ++;

        for(int i = 0; i < 26; i++)
            if(note[i] > maga[i])
                return false;

        return true;
    }
}
