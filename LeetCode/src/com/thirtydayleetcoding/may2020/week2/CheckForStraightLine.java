package com.thirtydayleetcoding.may2020.week2;

public class CheckForStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2)
            return true;

        /*
         * (y3 - y2)  (y1 - y2)
         * -------- = ----------
         * (x3 - x2)  (x1 - x2)
         *
         */
        for(int i = 1; i < coordinates.length - 1; i++) {
          int lhs = (coordinates[i - 1][0] - coordinates[i][0]) * (coordinates[i + 1][1] - coordinates[i][1]);
          int rhs = (coordinates[i - 1][1] - coordinates[i][1]) * (coordinates[i + 1][0] - coordinates[i][0]);
          if(lhs != rhs)
              return false;
        }

        return true;
    }
}
