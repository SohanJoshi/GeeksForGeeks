package com.easy;

public class MaximumDistanceToClosestPerson_849 {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;

        int maxDistance = 0;
        int dFromLastOne = 0;

        for(int i = 0; i < seats.length; i++) {
            if(seats[i] == 1) {
                int dis = 0;
                if(i == dFromLastOne)
                    dis = dFromLastOne;
                else
                    dis = (dFromLastOne + 1) / 2;
                maxDistance = Math.max(dis, maxDistance);
                dFromLastOne = 0;
            }
            else
                dFromLastOne ++;
        }
        if(seats[n - 1] == 0)
            maxDistance = Math.max(maxDistance, dFromLastOne);
        return maxDistance;
    }
}
