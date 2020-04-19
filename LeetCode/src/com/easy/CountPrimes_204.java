package com.easy;

import java.util.Arrays;

public class CountPrimes_204 {
    public int countPrimes(int n) {
        if(n < 2)
            return 0;

        boolean[] nums = new boolean[n];
        int count = n - 2;
        Arrays.fill(nums, true);

        for(int i = 2; i * i < n; i++) {
            if(nums[i])
                for(int j = 2; j * i < n; j++)
                    if(nums[j * i] = true) {
                        nums[j * i] = false;
                        count--;
                    }
         }

        return count - 2;
    }
}
