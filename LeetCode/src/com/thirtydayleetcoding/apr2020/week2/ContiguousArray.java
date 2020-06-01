package com.thirtydayleetcoding.apr2020.week2;

public class ContiguousArray {
    private int maxLength = 0;

    public int findMaxLength(int[] nums) {
        if(nums.length < 2)
            return 0;
        int n = nums.length;
        int[] cumulativeOnes = new int[n];

        cumulativeOnes[0] = nums[0] == 1 ? 1 : 0;

        for(int i = 1; i < n; i++)
            cumulativeOnes[i] = cumulativeOnes[i - 1] + (nums[i] == 1 ? 1 : 0);

        findMaxLengthUtil(nums, cumulativeOnes, 0, n - 1);

        return maxLength;
    }

    private void findMaxLengthUtil(int[] nums, int[] cumulativeOnes, int start, int end) {
        if(end < start)
            return;
        if(end - start + 1 < maxLength)
            return;

        int ones;
        if(start == 0)
            ones = cumulativeOnes[end];
        else
            ones = (cumulativeOnes[end] - cumulativeOnes[start - 1]);
        int zeroes = end - start + 1 - ones;

        if(ones == zeroes)
            maxLength = end - start + 1;

        findMaxLengthUtil(nums, cumulativeOnes, start + 1, end);
        findMaxLengthUtil(nums, cumulativeOnes, start, end - 1);
    }
}