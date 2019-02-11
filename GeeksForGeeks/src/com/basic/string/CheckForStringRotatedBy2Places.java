package com.basic.string;

import java.util.Scanner;

public class CheckForStringRotatedBy2Places {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		while(T --> 0) {
			String strA = in.next();
			String strB = in.next();
			int result = check2PlacesRotation(strA, strB) ? 1:0;
			System.out.println(result);
		}
		in.close();
	}
	
	private static boolean check2PlacesRotation(String strA, String strB) {
		if(strA.length() != strB.length())
			return false;
		
		return (strB.substring(2) + strB.substring(0, 2))
				.equals(strA)
				|| (strB.substring(strB.length() - 2) + strB.substring(0, strB.length() - 2))
				.equals(strA);
	}

}
