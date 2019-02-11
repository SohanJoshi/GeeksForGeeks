package com.basic.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeadersInArray {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String elements[] = line.split(" ");
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(elements[i]);
			
			int rightMax = -1;
			String leaders = "";
			for(int i = n -1 ; i >= 0; i--) {
				if(arr[i] > rightMax) {
					leaders = arr[i] + " " + leaders;
					rightMax = arr[i];
				}
			}
			System.out.println(leaders);
		}
		br.close();
	}

}
