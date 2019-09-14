package com.medium;

import java.util.HashSet;
import java.util.Set;

public class SmallestDistinctSubSeq_1081 {
    public String smallestSubsequence(String text) {
        Set<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder("");

        for(char c : text.toCharArray())
        {
            if(!set.contains(c))
            {
                builder.append(c);
                set.add(c);
            }
        }

        return builder.toString();
    }
}
