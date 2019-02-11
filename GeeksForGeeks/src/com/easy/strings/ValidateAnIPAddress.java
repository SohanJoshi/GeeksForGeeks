package com.easy.strings;

import java.util.Scanner;

public class ValidateAnIPAddress {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			String str = in.next();
			System.out.println(isValid(str)?"1":"0");
		}
		in.close();
	}

	public static boolean isValid(String s) {
		int dotCount = 0;
		int n = s.length();
		
		if(n < 7 || n > 15)
			return false;
		
		while (dotCount <= 3) {
			int indexOfDot = s.indexOf('.');
			if(indexOfDot == -1 && dotCount < 3)
				return false;
			dotCount ++;
			if (indexOfDot == 0 || indexOfDot > 3)
				return false;
			try {
				String addrStr ;
				if(dotCount != 4)
					addrStr = s.substring(0, indexOfDot);
				else
					addrStr = s;
				if(addrStr.length() > 1 && addrStr.startsWith("0"))
					return false;
				int add = Integer.parseInt(addrStr);
				if (add > 255 || add < 0)
					return false;
				if(dotCount != 4)
					s = s.replaceFirst(addrStr + ".", "");
				else
					s = s.replaceFirst(addrStr, "");
			} catch (NumberFormatException nfe) {
				return false;
			} 
		}
		
		if(s.length() > 0)
			return false;
		
		return true;
	}
	
}
