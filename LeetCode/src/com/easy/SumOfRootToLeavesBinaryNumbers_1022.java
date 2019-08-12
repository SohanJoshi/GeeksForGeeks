package com.easy;

import java.util.LinkedList;
import java.util.List;

import com.util.TreeNode;

public class SumOfRootToLeavesBinaryNumbers_1022 {
	public int sumRootToLeaf(TreeNode root) {

		List<String> binaryStrings = new LinkedList<>();

		getBinaryStrings(root, binaryStrings, "");

		int sum = 0;

		for(String binaryString : binaryStrings)
			sum += convertBinaryStringToDecimalNumber(binaryString);

		return sum;
	}

	private int convertBinaryStringToDecimalNumber(String binaryString) {
		int result = 0;
		char stringArray[] = binaryString.toCharArray();
		int n = stringArray.length;

		for(int i = n - 1; i >=0 ; i--) 
			if(stringArray[i] == '1')
				result += Math.pow(2, n - i - 1);		

		return result;
	}

	private void getBinaryStrings(TreeNode root, List<String> binaryStrings, String currentString) {
		if(root == null)
			return;
		currentString += root.val;
		if(root.left == null && root.right == null) 
			binaryStrings.add(currentString);
		else {
			getBinaryStrings(root.left, binaryStrings, currentString);
			getBinaryStrings(root.right, binaryStrings, currentString);
		}

	}
}
