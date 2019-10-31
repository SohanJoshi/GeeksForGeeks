package com.easy;

public class ToLowerCase_709 {
    public String toLowerCase(String str) {
        char arr[] = str.toCharArray();

        int diff = 'A' - 'a';

        for(int i = 0; i < arr.length; i++)
            if(arr[i] >= 'A' && arr[i] <= 'Z')
                arr[i] -= diff;
        return new String(arr);
    }
}
