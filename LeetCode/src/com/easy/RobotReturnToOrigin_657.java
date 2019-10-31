package com.easy;

public class RobotReturnToOrigin_657 {
    public boolean judgeCircle(String moves) {
        int x_axes = 0, y_axes = 0;

        for(char c : moves.toCharArray())
            if(c == 'L') x_axes ++;
            else if(c == 'R') x_axes --;
            else if(c == 'U') y_axes ++;
            else  y_axes --;

        return x_axes == 0 && y_axes == 0;
    }
}
