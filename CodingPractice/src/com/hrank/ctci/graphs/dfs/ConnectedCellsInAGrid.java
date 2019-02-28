package com.hrank.ctci.graphs.dfs;

import java.util.Scanner;

public class ConnectedCellsInAGrid {
	public static int getBiggestRegion(int[][] matrix, int n, int m) {
		boolean visited [][] = new boolean[n][m];
		
		int regionCount = 0;
		
		for(int i = 0 ; i < n; i++)
			for(int j = 0; j < m; j++) {
				if(!visited[i][j])
					regionCount = Math.max(regionCount, getRegionCountFromIndex(matrix, visited, n, m, i, j));
			}
		
		return regionCount;
    }
    
    private static int getRegionCountFromIndex(int[][] matrix, boolean[][] visited, int n, int m, int r, int c) {
    	int count = 0;
    	visited[r][c] = true;
    	if( matrix[r][c] == 1 ) {
    		count ++;
    		for(int i = r - 1 ; i <= r + 1; i++)
    			for(int j = c - 1 ; j <= c + 1 ; j++)
    				if(i >= 0 && i < n 
    						&& j >= 0 && j < m 
	    						&& !(i == r && j == c) 
	    						&& !visited[i][j]) {
//    					System.out.println(i + " " + j);
    					count += getRegionCountFromIndex(matrix, visited, n, m, i, j);
    				}
    	}
    	return count;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid,n,m));
        in.close();
    }
}
