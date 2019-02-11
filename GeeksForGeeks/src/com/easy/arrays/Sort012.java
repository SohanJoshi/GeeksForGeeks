package com.easy.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while(T -- > 0) {
			int n = Integer.parseInt(br.readLine());
			String elements[] = br.readLine().split(" ");
			StringBuffer zeros = new StringBuffer("");
			StringBuffer ones = new StringBuffer("");
			StringBuffer twos = new StringBuffer("");
			for(int i = 0 ; i < n ; i++) {	
				switch(elements[i]) {
				case "0" : zeros.append("0 ");
					break;
				case "1" : zeros.append("1 ");
					break;
				case "2" : zeros.append("2 ");
					break;
				}
			}
			zeros.append(ones).append(twos);
			System.out.println(zeros.toString());
		}
		br.close();
	}

}
