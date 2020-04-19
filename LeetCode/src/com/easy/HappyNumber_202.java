package com.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {
    public boolean isHappy(int n) {
        Set<Integer> coveredResults = new HashSet<>();

        while (true) {
            int sumOfDigitsSquarred = 0;
            while(n > 0) {
                int unit = n % 10;
                sumOfDigitsSquarred += (unit * unit);
                n /= 10;
            }
            if(sumOfDigitsSquarred == 1)
                return true;
            else if(coveredResults.contains(sumOfDigitsSquarred))
                return false;
            coveredResults.add(sumOfDigitsSquarred);
            n = sumOfDigitsSquarred;
        }

    }
}
