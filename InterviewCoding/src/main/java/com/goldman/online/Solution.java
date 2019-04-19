package com.goldman.online;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	/*
     * Complete the countPossibleTriangles function below.
     */
    static int countPossibleTriangles(int A, int P, int a) {
    	if(A == 0 || P == 0 || a == 0)
    		return 0;
        long A2 = A * A;
        double S = (double) P / 2;
        double S2 = S * S;
        int bPlusc = P - a;
        
        double expr = ((double)A2 / (S * (S - a))) - S2 + bPlusc * S;
        int count = 0;
        for(int b = 1; b <= bPlusc / 2 ; b ++) {
            int c = bPlusc - b;
            if((double)b * c >= expr && triangleCheck(a, b, c)) {
                count ++;
                System.out.println(b + " " + c);
                System.out.println("Area : " + Math.sqrt(S * (S - a) * (S - b) * (S - c)));
            }

        }

        return count;
    }

    private static boolean triangleCheck(int a, int b, int c) {
        if(a >= b + c)
            return false;
        if(b >= a + c)
            return false;
        if(c >= a + b)
            return false;
        return true;
    }
    
    public static void main(String[] args) {
		//System.out.println(countPossibleTriangles(10, 15, 5));
    	
    	List<List<Integer>> matrix = new ArrayList<>();
    	List<Integer> list = new ArrayList<>();
    	list.add(1);
    	list.add(0);
    	list.add(0);
    	list.add(1);
    	matrix.add(list);
    	list = new ArrayList<>();
    	list.add(0);
    	list.add(1);
    	list.add(1);
    	list.add(1);
    	matrix.add(list);
    	list = new ArrayList<>();
    	list.add(1);
    	list.add(0);
    	list.add(0);
    	list.add(1);
    	matrix.add(list);
    	int count = countConnections(matrix);
    	System.out.println(count);
	}
    
    static int countConnections(List<List<Integer>> matrix) {
    	if(matrix == null || matrix.size() == 0)
    		return 0;
    	int m = matrix.size();
    	int n = matrix.get(0).size();
    	
    	boolean[][] visited = new boolean[m][n];
    	
    	int connections = 0;
    	
    	int i = 0, j= 0;
    	
    	for(List<Integer> list : matrix) {
    		j = 0;
    		for(int value : list) {
    			visited[i][j] = true;
    			if(value == 0) {
    				j++;
    				continue;
    			}
                if (i - 1 >= 0 && j - 1 >= 0 && matrix.get(i - 1).get(j - 1) == 1 && !visited[i - 1][j - 1])
                    connections++;
                if (j - 1 >= 0 && matrix.get(i).get(j - 1) == 1 && !visited[i][j - 1])
                    connections++;
                if (i + 1 < m && j - 1 >= 0 && matrix.get(i + 1).get(j - 1) == 1 && !visited[i + 1][j - 1])
                    connections++;
                if (i - 1 >= 0 && matrix.get(i - 1).get(j) == 1 && !visited[i - 1][j])
                    connections++;
                if (i + 1 < m && matrix.get(i + 1).get(j) == 1 && !visited[i + 1][j])
                    connections++;
                if (i - 1 >= 0 && j + 1 < n && matrix.get(i - 1).get(j + 1) == 1 && !visited[i - 1][j + 1])
                    connections++;
                if (j + 1 < n && matrix.get(i).get(j + 1) == 1 && !visited[i][j + 1])
                    connections++;
                if (i + 1 < m && j + 1 < n && matrix.get(i + 1).get(j + 1) == 1 && !visited[i + 1][j + 1])
                    connections++;
    			j++;
    		}
    		i++;
    	}
    	
    	return connections;
    }
}
