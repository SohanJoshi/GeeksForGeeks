package com.thirtydayleetcoding.may2020.week1;

public class NumberComplement {
    public int findComplement(int num) {
        int complement = 0, temp = num;
        int digit = 0;
        while(temp > 0) {
            byte bit = (byte) (temp % 2 == 0 ? 0 : 1);
            if(bit == 0)
            {
                complement += (1 << digit);
            }
            temp >>= 1;
            digit ++;
        }

        return complement;
    }

}
