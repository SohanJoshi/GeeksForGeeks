package com.medium.string;

public class InterleavedStrings {

	public boolean isInterLeave(String a,String b,String c)
	{
		char a_arr[] = a.toCharArray();
		char b_arr[] = b.toCharArray();
		char c_arr[] = c.toCharArray();
		return isInterLeaveUtil(a_arr, 0, b_arr, 0, c_arr, 0);
	}

	private boolean isInterLeaveUtil(char[] a_arr, int a_index, 
			char[] b_arr, int b_index, 
			char[] c_arr, int c_index) {
		if (a_index >= a_arr.length 
				&& b_index >= b_arr.length
				&& c_index >= c_arr.length)
			return true;
		boolean result1 = false, result2 = false;
		if(a_index < a_arr.length && a_arr[a_index] == c_arr[c_index])
			result1 = isInterLeaveUtil(a_arr, a_index + 1, b_arr, b_index, c_arr, c_index + 1);
		if(b_index < b_arr.length && b_arr[b_index] == c_arr[c_index])
			result2 = isInterLeaveUtil(a_arr, a_index, b_arr, b_index + 1, c_arr, c_index + 1);
		return result1 || result2;
	}

}
