package com.thirtydayleetcoding.apr2020.week1;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {
    public int countElements(int[] arr) {
        if(arr.length <= 1)
            return 0;
        int count = 0;

        Set<Integer> set = new HashSet<>(arr.length);
        for(int value : arr)
            set.add(value);

        for(int value : arr)
            if(set.contains(value + 1))
                count ++;

        return count;
    }
}
