package com.easy;

public class LongestContinuousIncreasingSubsequence_674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        int maxLength = 1;
        int currentLength = 1;

        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] > nums[i - 1])
                currentLength ++;
            else {
                currentLength = 1;
            }
            if(currentLength > maxLength)
                maxLength = currentLength;
        }
        return maxLength;
    }
}
