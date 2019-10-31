package com.easy;

public class ReverseInteger_7 {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        if(isNegative)
            x = -1 * x;

        long rev = 0;
        while(x > 0){
            rev *= 10;
            rev += x % 10;
            x /= 10;
        }
        if(isNegative)
            rev = -1 * rev;

        if(rev < Integer.MIN_VALUE|| rev > Integer.MAX_VALUE)
            return 0;

        return (int)rev;
    }
}
