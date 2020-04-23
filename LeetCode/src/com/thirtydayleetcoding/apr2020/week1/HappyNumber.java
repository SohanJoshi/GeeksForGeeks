package com.thirtydayleetcoding.apr2020.week1;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        int x = n;
        while(x != 1) {
            int sumOfSquares = 0;
            while( x > 0) {
                int rem = x / 10;
                sumOfSquares += (rem * rem);
                x /= 10;
            }
            if(!set.add(sumOfSquares))
                return false;
            x = sumOfSquares;
        }

        return true;
    }
}
