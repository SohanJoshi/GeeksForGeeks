package com.easy;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbersInArray_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0)
            return new ArrayList<>(0);

        for(int i = 0; i < nums.length ; i++)
        {
            int value = Math.abs(nums[i]) - 1;
            nums[value] = -Math.abs(nums[value]);
        }
        List<Integer> resultList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
            if(nums[i] > 0)
                resultList.add(i + 1);

        return resultList;
    }
}
