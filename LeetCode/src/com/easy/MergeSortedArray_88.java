package com.easy;

public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num1_temp = new int[m];

        System.arraycopy(nums1, 0, num1_temp, 0, m);

        int i = 0, j = 0, k = 0;
        while(i < m && j < n)
        {
            if(num1_temp[i] < nums2[j])
                nums1[k ++] = num1_temp[i ++];
            else
                nums1[k ++] = nums2[j ++];
        }
        while(i < m)
            nums1[k ++] = num1_temp[i ++];
        while (j < n)
            nums1[k ++] = nums2[j ++];
    }
}
