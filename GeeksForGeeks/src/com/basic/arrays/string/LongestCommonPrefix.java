package com.basic.arrays.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String arr[] = line.split("\\s+");
			
			Arrays.sort(arr);
			
			StringBuffer buffer = new StringBuffer("");
			
			for(int i = 0; i < arr[0].length() && i < arr[n - 1].length(); i++) {
				if(arr[0].charAt(i) != arr[n - 1].charAt(i))
					break;
				buffer.append(arr[0].charAt(i));
			}
			if(buffer.length() == 0)
				buffer.append("-1");
			System.out.println(buffer);
		}
	}

}
