package com.thirtydayleetcoding.may2020.week1;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> charIndexMap = new LinkedHashMap<>();
        Set<Character> visited = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(visited.contains(arr[i]))
                charIndexMap.remove(arr[i]);
            else {
                charIndexMap.put(arr[i], i);
                visited.add(arr[i]);
            }

        }
        if(charIndexMap.isEmpty())
            return -1;

        return charIndexMap.get(charIndexMap.keySet().iterator().next());
    }
}
