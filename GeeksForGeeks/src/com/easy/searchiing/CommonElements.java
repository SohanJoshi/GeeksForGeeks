package com.easy.searchiing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommonElements {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			String constraints = br.readLine();
			int n1 = Integer.parseInt(constraints.substring(0, constraints.indexOf(' ')).trim());
			int n2 = Integer.parseInt(constraints.substring(constraints.indexOf(' '), constraints.lastIndexOf(' ')).trim());
			int n3 = Integer.parseInt(constraints.substring(constraints.lastIndexOf(' ')).trim());
			String line = br.readLine();
			String arrStr[] = line.split("\\s+");
			
			int arr1[] = new int[n1];
			for(int i = 0; i < n1; i++)
				arr1[i] = Integer.parseInt(arrStr[i].trim());
			
			line = br.readLine();
			arrStr = line.split("\\s+");
			int arr2[] = new int[n2];
			for(int i = 0; i < n2; i++)
				arr2[i] = Integer.parseInt(arrStr[i].trim());

			line = br.readLine();
			arrStr = line.split("\\s+");
			int arr3[] = new int[n3];
			for(int i = 0; i < n3; i++)
				arr3[i] = Integer.parseInt(arrStr[i].trim());
			
			int i = 0, j = 0, k = 0;
			StringBuffer buffer = new StringBuffer("");
			while(i < n1 && j < n2 && k < n3) {
				if(arr1[i] == arr2[j] && arr1[i] == arr3[k]) {
					buffer.append(arr1[i] + " ");
					i++; j++; k++;
				}
				else if(arr1[i] < arr2[j] && arr1[i] < arr3[k])
					i++;
				else if(arr2[j] < arr1[i] && arr2[j] < arr3[k])
					j++;
				else if(arr3[k] < arr1[i] && arr3[k] < arr2[j])
					k++;
			}
			System.out.println(buffer);
		}
	}
}
