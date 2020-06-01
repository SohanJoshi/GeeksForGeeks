package com.thirtydayleetcoding.may2020.week1;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
