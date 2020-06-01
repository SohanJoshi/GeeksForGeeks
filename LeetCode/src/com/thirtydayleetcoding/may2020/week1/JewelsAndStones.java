package com.thirtydayleetcoding.may2020.week1;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;

        Set<Character> jewels = new HashSet<>(J.length());
        for(char j : J.toCharArray())
            jewels.add(j);

        for(char s : S.toCharArray())
            if(jewels.contains(s))
                count ++;

        return count;
    }
}
