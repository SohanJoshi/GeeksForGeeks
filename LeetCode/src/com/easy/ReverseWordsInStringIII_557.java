package com.easy;

public class ReverseWordsInStringIII_557 {
    public String reverseWords(String s) {
        if(s == null || s.isEmpty())
            return s;

        int i = 0, j = 0, next = 0;
        char arr[] = s.toCharArray();
        while(j < arr.length)
        {
            while(j < arr.length && arr[j] != ' ')
                j++;
            next = j + 1;
            j--;
            while(i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            i = j = next;
        }

        return new String(arr);
    }

}
