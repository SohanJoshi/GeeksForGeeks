package com.basic.string;

import java.util.Scanner;

public class ImplementAtoI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0) {
			String str = in.next();
			str = str.trim();
			int result = 0;
			boolean isNegative = false;
			if(str.startsWith("-")) {
				str = str.substring(1);
				isNegative = true;
			}
			
			for(char c : str.toCharArray()) {
				if(c < '0' || c > '9') {
					result = -1;
					break;
				}
				result *= 10;
				result += c - '0';
			}
			
			if(isNegative)
				result *= -1;
			
			System.out.println(result);
		}
		in.close();
	}

}
