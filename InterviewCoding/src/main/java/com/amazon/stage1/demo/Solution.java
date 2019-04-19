package com.amazon.stage1.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Solution
{        
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
        int n = states.length;
        int temp[] = new int[n];
        for(int i = 0 ; i < days; i++) {
            for(int j = 0; j < n; j++) {
                if(j == 0)
                    temp[j] = states[j + 1] == 0? 0:1;
                else if(j == n - 1)
                    temp[j] = states[j - 1] == 0? 0:1;
                else
                    temp[j] = states[j - 1] == states[j + 1] ? 0 : 1;
            }
            int temp2[] = temp;
            temp = states;
            states = temp2;
        }
        
        List<Integer> list = Arrays.stream(states).boxed().collect(Collectors.toList());

        return list;
    }
  // METHOD SIGNATURE ENDS
}
