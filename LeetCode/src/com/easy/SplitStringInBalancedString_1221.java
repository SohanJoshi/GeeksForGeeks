package com.easy;

public class SplitStringInBalancedString_1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int rlDiff = 0;

        for(char c : s.toCharArray())
        {
            if(c == 'R')
                rlDiff ++;
            else
                rlDiff --;

            if(rlDiff == 0)
                count++;
        }
        return count;
    }
}
