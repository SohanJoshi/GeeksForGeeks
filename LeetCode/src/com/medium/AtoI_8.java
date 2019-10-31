package com.medium;

public class AtoI_8 {
    public int myAtoi(String str) {
        char arr[] = str.trim().toCharArray();
        boolean negative = false;
        int index = 0;

        if(arr.length == 0)
            return 0;

        if(arr[index] == '-' )
        {
            negative = true;
            index ++;
        }
        else if(arr[index] == '+')
            index ++;

        if(index == arr.length)
            return 0;

        if(arr[index] < '0' || arr[index] > '9')
            return 0;

        long number = 0;

        while(index < arr.length && arr[index] >= '0' && arr[index] <= '9')
        {
            number *= 10;
            number += (long) (arr[index] - '0');
            index ++;

            if(number > Integer.MAX_VALUE && !negative)
                return Integer.MAX_VALUE;
            if(number > (long)Integer.MAX_VALUE + 1 && negative)
                return Integer.MIN_VALUE;
        }

        if(negative)
            number *= -1;

        return (int)number;
    }

    public static void main(String[] args) {
        int n = new AtoI_8().myAtoi("    -42");
        System.out.println(n);
    }

}
