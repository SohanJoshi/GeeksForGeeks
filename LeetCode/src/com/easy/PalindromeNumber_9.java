package com.easy;

public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        if(x == 0)
            return true;
        if(x < 0 || x % 10 == 0)
            return false;
        int reverse = 0, temp = x;

        while (temp > 0)
        {
            reverse *= 10;
            reverse += temp %10;
            temp /= 10;
        }

        return reverse == x;
    }
}
