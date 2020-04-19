package com.easy;

public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if((flowerbed == null || flowerbed.length == 0) && n == 0)
            return true;
        if(flowerbed == null || flowerbed.length == 0)
            return false;
        if(n == 0)
            return true;

        int count = 0, i = 0;
        while(i < flowerbed.length) {
            if(flowerbed[i] == 0
                    && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i - 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            if(count >= n)
                return true;
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new CanPlaceFlowers_605().canPlaceFlowers(new int[]{0,0,0}, 2));
    }
}
