package com.thirtydayleetcoding.apr2020.week3;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length <= 1)
            return nums;

        int nonZeroProduct = 1;
        int numOfZeroes = 0;
        int n = nums.length;
        int zeroIndex = -1;

        int[] productArray = new int[n];

        for (int i = 0; i < n; i++) {
            if(nums[i] == 0) {
                numOfZeroes++;
                zeroIndex = i;
            }
            else
                nonZeroProduct *= nums[i];
        }

        if(numOfZeroes == 0) {
            for (int i = 0; i < n; i++)
                productArray[i] = nonZeroProduct / nums[i];
        }
        else if(numOfZeroes == 1)
            productArray[zeroIndex] = nonZeroProduct;

        return productArray;
    }

    public static void main(String[] args) {
        checkSumAndXor(new int [] {1,2,3,4});
    }

    private static void checkSumAndXor(int[] nums) {
        int product = product(nums);
        int xor = xor(nums);

        boolean result = product == xor;

        System.out.println(result);
    }

    private static int xor(int[] nums) {
        int xor = nums[0];

        for(int i = 1; i < nums.length; i++)
            xor ^= nums[i];
        
        System.out.println(xor);
        
        return xor;
    }

    private static int product(int[] nums) {
        int product = nums[0];

        for(int i = 1; i < nums.length; i++)
            product *= nums[i];

        System.out.println(product);

        return product;
    }


}
