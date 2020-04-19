package com.easy;

public class SumOfTwoIntegers_371 {
    public int getSum(int a, int b) {
        int carry;
        while(a != 0 && b != 0)
        {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a == 0 ? b : a;
    }
}
