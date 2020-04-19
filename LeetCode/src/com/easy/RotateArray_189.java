package com.easy;

public class RotateArray_189 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        new RotateArray_189().reverse(arr, 3, 6);
        for(int i : arr)
            System.out.print(i + " ");
    }

    /**
     * Reverse method
     * @param nums
     * @param d
     */
    public void rotate5(int nums[], int d) {
        reverse(nums, 0, nums.length);
        reverse(nums, 0, d - 1);
        reverse(nums, d, nums.length);
    }

    public void reverse(int[] nums, int begin, int end) {
        for(int i = 0; i <= (end - begin) / 2; i++) {
            int temp = nums[begin + i];
            nums[begin + i] = nums[end - i];
            nums[end - i] = temp;
        }
    }

    /**
     * Swap method
     * @param nums
     * @param d
     */
    public void rotate4(int[] nums, int d) {
        if(nums == null || nums.length < 2)
            return;
        d %= nums.length;
        if(d == 0)
            return;

        rotateUtil(nums, 0, d - 1, d, nums.length - 1);
    }

    private void rotateUtil(int[] nums, int A_begin, int A_end, int B_begin, int B_end) {
        int A_length = A_end - A_begin + 1;
        int B_length = B_end - B_begin + 1;

        if(A_length == B_length) {
            swap(nums, A_begin, B_begin, A_length);
        }
        else if(A_length < B_length) {
            swap(nums, A_begin, B_end - A_length + 1, A_length);
            rotateUtil(nums, B_begin, B_begin + A_length, B_end - A_length, B_end);
        }
        else {
            swap(nums, A_begin, B_begin, B_length);
            rotateUtil(nums, A_begin,A_begin + B_length , A_begin + B_length + 1, A_end);
        }

    }

    private void swap(int[] nums, int a_begin, int b_begin, int length) {
        for(int i = 0; i < length; i++) {
            int temp = nums[a_begin + i];
            nums[a_begin + i] = nums[b_begin + i];
            nums[b_begin + i] = temp;
        }
    }

    /**
     * Time = O(n)
     * Space = O(1)
     * @param nums
     * @param d
     */
    public void rotate3(int[] nums, int d) {
        if(nums == null || nums.length < 2)
            return;
        d %= nums.length;
        if(d == 0)
            return;
        int gcd = gcd(nums.length, d);
        int n = nums.length;
        for(int i = n - gcd; i < n; i++) {
            int j = i;
            int temp = nums[j];
            while(true) {
                int k = j - d < 0 ? j - d + n: j - d;
                nums[j] = nums[k];
                j = k;
                if(j == i)
                    break;
            }
            nums[(j + d) % n] = temp;
        }
    }

    private int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    /**
     * Time = O(n * d)
     * Space = O(1)
     * @param nums
     * @param k
     */
    public void rotate2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if(k == 0)
            return;
        for(int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for(int j = n - 1; j > 0; j--)
                nums[j] = nums[j - 1];
            nums[0] = temp;
        }
    }

    /**
     * Time = O(n)
     * Space = O(d)
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        int[] temp = new int[k];
        int n = nums.length;
        k %= n;
        if(k == 0)
            return;

        for (int i = 0; i < k; i ++)
            temp[i] = nums[n - k + i];

        for (int i = n - 1; i >= k; i-- )
            nums[i] = nums[i - k];

        for(int i = 0; i < k; i++)
            nums[i] = temp[i];

    }
}
