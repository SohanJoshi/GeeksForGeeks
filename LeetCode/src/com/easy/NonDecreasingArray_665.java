package com.easy;

public class NonDecreasingArray_665 {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <= 1)
            return true;
        boolean oneDone = false;

        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] < nums[i - 1]) {
                if(oneDone)
                    return false;
                oneDone = true;
                if(i >= 2 && nums[i] < nums[i - 2])
                    nums[i] = nums[i - 1];
                else
                    nums[i - 1] = nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = new NonDecreasingArray_665().checkPossibility(new int [] {2,3,3,2,4});
        System.out.println(res);
    }
}
