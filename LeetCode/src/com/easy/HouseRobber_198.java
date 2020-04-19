package com.easy;

public class HouseRobber_198 {
    public int rob(int nums[]) {
        if(nums == null || nums.length == 0 )
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0], nums[1]);
        if(nums.length == 3)
            return Math.max(nums[0] + nums[2], nums[1]);
        int n = nums.length;

        int current, first, second, third;

        first = nums[0];
        second = nums[1];
        third = nums[0] + nums[2];
        current = third;

        int max = Math.max(second, third);

        for(int i = 3; i < n; i++) {
            current = Math.max(first, second) + nums[i];
            if(current > max)
                max = current;
            first = second;
            second = third;
            third = current;
        }

        return max;
    }
}
