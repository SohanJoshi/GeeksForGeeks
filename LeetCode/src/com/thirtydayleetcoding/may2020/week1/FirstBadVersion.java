package com.thirtydayleetcoding.may2020.week1;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        if(isBadVersion(1))
            return 1;
        if(isBadVersion(n) && !isBadVersion(n - 1))
            return n;

        int low = 1, high = n, mid;

        while(low <= high) {
            mid = low + (high - low) / 2;

            if(isBadVersion(mid))
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    boolean isBadVersion(int version) {
        return false;
    }
}
