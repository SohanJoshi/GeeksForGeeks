package com.thirtydayleetcoding.may2020.week2;

public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] trustsForPerson = new int[N];
        boolean[] trustsSomeone = new boolean[N];

        for (int i = 0; i < trust.length; i++) {
            trustsForPerson[trust[i][1] - 1] ++;
            trustsSomeone[trust[i][0] - 1] = true;
        }

        for (int i = 0; i < N; i++) {
            if(trustsForPerson[i] == (N - 1) && !trustsSomeone[i])
                return i + 1;
        }

        return -1;
    }
}
