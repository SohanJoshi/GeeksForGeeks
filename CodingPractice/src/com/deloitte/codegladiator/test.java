package com.deloitte.codegladiator;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {0,1,2,3,4,5,6,7,8};
		int index = 0;
		int count = 0;
		int node = sc.nextInt();
		for(int i = 0; i< 5; i++){
			if(arr[i] == node){
				index = i;
			}
		}
		if(arr.length % 2 != 0){
			System.out.println("Leafnodes : "+((arr.length /2) + 1));
		}
		
		for(int i = 0; i< 5; i++){
		 
		}
	}

}
