package com.basic.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LastIndexOf1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String stream = br.readLine();
			char[] arr = stream.toCharArray();
			int index = -1;
			for(int i = 0; i < arr.length; i++)
				if(arr[i] == '1')
					index = i;
			System.out.println(index);
		}
	}
}
