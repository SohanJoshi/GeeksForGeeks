package com.backtracking.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueenPuzzle {
    boolean foundSolution = false;

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        new NQueenPuzzle().findNQueenSolutions(n);
    }

    private void findNQueenSolutions(int boardSize) {
        List<Integer> list = new ArrayList<>();

        boolean[][] visited = new boolean[boardSize + 1][boardSize + 1];

        for(int i = 1; i <= boardSize; i++)
            findNQueenSolutionsUtil(boardSize, i, 1, list, visited);

        if(!foundSolution)
            System.out.println(-1);
    }

    private void findNQueenSolutionsUtil(int boardSize, int currentColumn, int row, List<Integer> resultList, boolean[][] visited) {
        if(row > boardSize)
            return;

        if(row == boardSize)
            printResult(resultList);

        for(int i = 1; i < row; i++)
        {
            if(visited[i][currentColumn])
                return;
            if(currentColumn - row + i > 0 && visited[i][currentColumn - row + i])
                return;
            if(currentColumn + row - i <= boardSize && visited[i][currentColumn + row - i])
                return;
        }

        visited[row][currentColumn] = true;

        resultList.add(row, currentColumn);

        for(int i = 1; i <= boardSize; i ++)
            findNQueenSolutionsUtil(boardSize, i, row + 1, resultList, visited);

        visited[row][currentColumn] = false;

    }

    private void printResult(List<Integer> resultList) {
        System.out.println(resultList);
    }


}
