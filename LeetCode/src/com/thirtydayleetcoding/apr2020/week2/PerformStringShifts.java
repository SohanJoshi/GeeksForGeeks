package com.thirtydayleetcoding.apr2020.week2;

public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int shiftDistance = 0;
        int len = s.length();

        for(int i = 0; i < shift.length; i ++) {
            int distance = shift[i][1];
            if(shift[i][0] == 1) {
                shiftDistance -= distance;
                if(shiftDistance < 0)
                    shiftDistance += len;
            }
            else
                shiftDistance = (shiftDistance + distance) % len;
        }

        s = s + s;
        s = s.substring(shiftDistance, shiftDistance + len);

        return s;
    }
}
