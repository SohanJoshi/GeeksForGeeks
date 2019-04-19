package com.moveinsync.stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(br.readLine().trim());
        while(t-- > 0 ) {
        	String inputs = br.readLine();
        	String arr[] = inputs.split("[\\s(,)]");
        	int n = Integer.valueOf(arr[0]);
        	int r = Integer.valueOf(arr[2]);
        	int c = Integer.valueOf(arr[3]);
        	
        	int result = n * n - 
        			(2 * (n - 1) 
        			+ (n - r < c - 1 ? n - r : c - 1)	//Math.min(n - r, c - 1) 
        			+ (r - 1 < c - 1 ? r - 1 : c - 1)	//Math.min(r - 1, c - 1) 
        			+ (n - r < n - c ? n - r : n - c)	//Math.min(n - r, n - c) 
        			+ (r - 1 < n - c ? r - 1 : n - c)	//Math.min(r - 1, n - c)
        			)
        			;
        	System.out.println(result);

        }
        
    }
}