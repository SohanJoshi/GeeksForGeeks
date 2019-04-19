package com.easy;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnTitle168 {

	public static void main(String[] args) {
		ExcelSheetColumnTitle168 test = new ExcelSheetColumnTitle168();
		
		assertEquals("A", test.convertToTitle(1));
		assertEquals("AB", test.convertToTitle(28));
		assertEquals("ZY", test.convertToTitle(701));
	}
	
    public String convertToTitle(int n) {
     
    	String alpha[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    	
    	int temp = n;
    	String result = "";
    	
    	while(temp / 26 > 0) {
    		result = alpha[temp / 26] + result;
    		temp /= 26;
    	}
    	
    	return result;
    }
	
}
