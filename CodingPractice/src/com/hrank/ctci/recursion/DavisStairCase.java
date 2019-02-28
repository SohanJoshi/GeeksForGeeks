package com.hrank.ctci.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class DavisStairCase {
	private static int solve(int n){
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        int stairs[] = new int[n];
        Arrays.fill(stairs, -1);
        return solveUtil(n, stairs);
    }
    
    private static int solveUtil(int n , int stairs[]){
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        if(stairs[n - 1] == -1)
            stairs[n - 1] = solveUtil(n - 1, stairs) + solveUtil(n - 2, stairs) + solveUtil(n - 3, stairs);
        return stairs[n - 1];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(solve(n));
        }
        in.close();
    }
}
