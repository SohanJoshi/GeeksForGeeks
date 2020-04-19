package com.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public int romanToInt(String s) {
        if(s == null || s.isEmpty())
            return 0;

        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            if(i > 0 && map.get(c[i]) > map.get(c[i - 1]))
                result += (map.get(c[i]) - 2 * map.get(c[i - 1]));
            else
                result += map.get(c[i]);
        }

        return result;
    }
}
