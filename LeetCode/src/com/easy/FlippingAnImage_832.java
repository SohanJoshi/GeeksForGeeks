package com.easy;

public class FlippingAnImage_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int temp ;
        for(int i = 0; i < A.length; i++)
        {
            int j = 0, k = A[i].length - 1;
            while(j <= k)
            {
                if(j == k)
                    A[i][j] = 1 - A[i][j];
                else
                {
                    temp = A[i][j];
                    A[i][j] = 1 - A[i][k];
                    A[i][k] = 1 - temp;
                }
                j ++;
                k --;
            }

        }

        return A;
    }
}
