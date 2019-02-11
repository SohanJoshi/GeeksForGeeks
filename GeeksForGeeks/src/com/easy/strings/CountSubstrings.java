package com.easy.strings;

import java.util.Scanner;

public class CountSubstrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T-- > 0) {
			String str = in.next();
			int oneCount = 0;
			for(int i = 0; i < str.length(); i++)
				if(str.charAt(i) == '1')
					oneCount ++;
			int result = (oneCount * (oneCount - 1 )) / 2;
			
			System.out.println(result);
		}
		in.close();
	}

}
