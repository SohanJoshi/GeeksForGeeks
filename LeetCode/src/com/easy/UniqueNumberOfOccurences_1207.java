package com.easy;

import java.util.*;

public class UniqueNumberOfOccurences_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int key : arr)
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);

        Set<Integer> frequencies = new HashSet<>(freqMap.values());

        return freqMap.size() == frequencies.size();
    }
}
