package com.thirtydayleetcoding.apr2020.week1;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int value : nums)
            result ^= value;

        return result;
    }
}
