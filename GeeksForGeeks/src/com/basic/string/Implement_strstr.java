package com.basic.string;

public class Implement_strstr {

	public static void main(String[] args) {
		System.out.println(new Implement_strstr().strstr("GeeksForGeeks","For"));

	}

	int strstr(String str, String target) {
		char strArr[] = str.toCharArray();
		char targetArr[] = target.toCharArray();
		for(int i = 0; i < strArr.length; i ++) {
			int j = i, k = 0;
			while(k < targetArr.length && strArr[j++] == targetArr[k++]);
			if(k == targetArr.length)
				return i;
		}
		return -1;
	}
	
}
