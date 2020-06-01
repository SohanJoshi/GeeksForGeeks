package com.thirtydayleetcoding.apr2020.week2;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        if(S.equals(T))
            return true;
        char[] S_resolved = new char[S.length()];
        char[] T_resolved = new char[T.length()];

        int S_size = 0;
        int T_size = 0;

        for(char c : S.toCharArray()) {
            if(c == '#') {
                if (S_size > 0)
                    S_size--;
            }
            else
                S_resolved[S_size ++] = c;
        }

        for(char c : T.toCharArray()) {
            if(c == '#') {
                if (T_size > 0)
                    T_size--;
            }
            else
                T_resolved[T_size ++] = c;
        }

        if(S_size != T_size)
            return false;

        for(int i = 0; i < S_size; i++)
            if(S_resolved[i] != T_resolved[i])
                return false;

        return true;
    }
}
