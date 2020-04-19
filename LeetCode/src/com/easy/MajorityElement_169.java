package com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement(int [] nums, int i)
    {
        int majorityCount = (nums.length / 2);

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int value : nums)
        {
            int freq = freqMap.getOrDefault(value, 0) + 1;
            if(freq > majorityCount)
                return value;
            freqMap.put(value, freq);
        }

        return -1;

    }
}
