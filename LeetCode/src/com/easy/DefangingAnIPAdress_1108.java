package com.easy;

public class DefangingAnIPAdress_1108 {
    public String defangIPaddr(String address) {
        char arr1[] = address.toCharArray();

        char arr2[] = new char[arr1.length + 6];

        for(int i = 0, j = 0; i < arr1.length; i++)
        {
            if(arr1[i] == '.')
            {
                arr2[j++] = '[';
                arr2[j++] = '.';
                arr2[j++] = ']';
            }
            else
                arr2[j++] = arr1[i];
        }


        return new String(arr2);
    }
}
