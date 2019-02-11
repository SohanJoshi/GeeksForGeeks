package com.basic.arrays.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			int sum = 0;
			String str = br.readLine();
			String numbers[] = str.split(" ");
			for(String i : numbers) sum += Integer.parseInt(i);
			int exSum = (n * (n + 1)) / 2;
			int diff = exSum - sum;
			System.out.println(diff);
		}
		br.close();
	}

}
