package com.basic.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubarrayWithGivenSum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String constraints = br.readLine();
			int n = Integer.parseInt(constraints.substring(0, constraints.indexOf(' ')).trim());
			long sum = Long.parseLong(constraints.substring(constraints.indexOf(' ')).trim());
			String line = br.readLine();
			String arrStr[] = line.split("\\s+");
			
			int arr[] = new int[n];
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(arrStr[i].trim());
			
			long currentSum = arr[0];
			int begin = 0, end = 0;
			while (end < n) {
				if(currentSum == sum)
					break;
				else if(currentSum < sum) {
				    if(end == n - 1)
				        break;
					end++;
					currentSum += arr[end];
				} else if (currentSum > sum) {
					currentSum -= arr[begin];
					begin++;
				}
			}
			if(currentSum != sum)
				System.out.println(-1);
			else
				System.out.println((begin + 1) + " " + (end + 1));
		}
	}
}
