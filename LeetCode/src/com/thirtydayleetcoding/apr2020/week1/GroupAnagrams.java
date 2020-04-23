package com.thirtydayleetcoding.apr2020.week1;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringListMap = new HashMap<>();

        for(String str : strs) {
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!stringListMap.containsKey(sorted))
                stringListMap.put(sorted, new ArrayList<>());
            stringListMap.get(sorted).add(str);
        }

        List<List<String>> list = new ArrayList<>(stringListMap.size());
        list.addAll(stringListMap.values());

        return list;
    }
}
