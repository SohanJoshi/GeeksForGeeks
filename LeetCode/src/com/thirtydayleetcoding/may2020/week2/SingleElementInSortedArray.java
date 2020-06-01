package com.thirtydayleetcoding.may2020.week2;

public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1)
            return nums[0];

        int high = nums.length - 1, low = 0, mid;

        while(low < high)
        {
            mid = (low + high) / 2;
            if(nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid])
                return nums[mid];
            if(nums[mid - 1] == nums[mid]) {
                if((mid - low + 1) % 2 == 0)
                    low = mid + 1;
                else
                    high = mid - 2;
            }
            else if(nums[mid + 1] == nums[mid]) {
                if((high - mid + 1) % 2 == 0)
                    high = mid - 1;
                else
                    low = mid + 2;
            }
            else
                System.out.println("Something is wrong");
        }
        return nums[low];
    }
}
