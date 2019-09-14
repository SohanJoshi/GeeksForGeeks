package com.backtracking.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueenPuzzle {
    private boolean foundSolution = false;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            new NQueenPuzzle().findNQueenSolutions(n);
        }
    }

    private void findNQueenSolutions(int boardSize) {
        List<Integer> list = new ArrayList<>();

        boolean[][] visited = new boolean[boardSize + 1][boardSize + 1];

        for(int i = 1; i <= boardSize; i++)
            findNQueenSolutionsUtil(boardSize, i, 1, list, visited);

        if(!foundSolution)
            System.out.print(-1);

        System.out.println();
    }

    private void findNQueenSolutionsUtil(int boardSize, int currentColumn, int row, List<Integer> resultList, boolean[][] visited) {

        if (!isSafe(boardSize, row, currentColumn, visited))
            return;

        resultList.add(row - 1, currentColumn);

        if(row == boardSize)
            printResult(resultList);

        else
        {
            visited[row][currentColumn] = true;

            for(int i = 1; i <= boardSize; i ++)
                findNQueenSolutionsUtil(boardSize, i, row + 1, resultList, visited);

            visited[row][currentColumn] = false;
        }

        resultList.remove(row - 1);



    }

    private boolean isSafe(int n, int r, int c, boolean[][] visited) {
        for(int k = 1; k < r; k++)
        {
            if(visited[k][c])
                return false;
            if(c - r + k > 0 && visited[k][c - r + k])
                return false;
            if(c + r - k <= n && visited[k][c + r - k])
                return false;
        }
        return true;
    }

    private void printResult(List<Integer> resultList)
    {
        foundSolution = true;
        System.out.print("[");
        resultList.forEach(i -> System.out.print(i + " "));
        System.out.print("] ");
    }


}
