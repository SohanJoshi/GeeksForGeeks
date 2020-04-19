package com.easy;

public class FactorialTrailingZeroes_172 {
    public int trailingZeroes(int n) {
        int zeroCount = 0;

        long deno = 5;
        while((n / deno) > 1)
        {
            zeroCount += (n / deno);
            deno *= 5;
        }

        return zeroCount;
    }
}
