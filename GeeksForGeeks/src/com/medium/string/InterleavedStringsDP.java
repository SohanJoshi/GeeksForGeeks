package com.medium.string;

import java.util.Scanner;

public class InterleavedStringsDP {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            InterleavedStringsDP g=new InterleavedStringsDP();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
        sc.close();
    }

	
	public boolean isInterLeave(String a,String b,String c)
	{
		char a_arr[] = a.toCharArray();
		char b_arr[] = b.toCharArray();
		char c_arr[] = c.toCharArray();
		
		boolean interleavedDP[][] = new boolean[a_arr.length + 1][b_arr.length + 1];
		
		for (int i = 0; i < a_arr.length + 1; i++) {
			for (int j = 0; j < b_arr.length + 1; j++) {
				
				if(i == 0 && j == 0)
					interleavedDP[i][j] = true;
				else if(i == 0 && b_arr[j - 1] == c_arr[i + j - 1 ])
					interleavedDP[i][j] = interleavedDP[i][j -1];
				else if(j == 0 && a_arr[i - 1] == c_arr[i + j - 1 ])
					interleavedDP[i][j] = interleavedDP[i - 1][j];
				else if((i >  0 && a_arr[i - 1] == c_arr[i + j - 1]) && (j >  0 && b_arr[j - 1] != c_arr[i + j - 1]))
					interleavedDP[i][j] = interleavedDP[i - 1][j];
				else if((j >  0 && b_arr[j - 1] == c_arr[i + j - 1]) && (i >  0 && a_arr[i - 1] != c_arr[i + j - 1]))
					interleavedDP[i][j] = interleavedDP[i][j - 1];
			    else if((i >  0 && a_arr[i - 1] == c_arr[i + j - 1]) && (j >  0 && b_arr[j - 1] == c_arr[i + j - 1]))
					interleavedDP[i][j] = interleavedDP[i - 1][j] || interleavedDP[i][j - 1];
				else
				    interleavedDP[i][j] = false;
			}
		}
		
		return interleavedDP[a_arr.length][b_arr.length];
	}
}
