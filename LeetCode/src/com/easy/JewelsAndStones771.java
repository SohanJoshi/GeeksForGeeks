package com.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {
    public int numJewelsInStones(String J, String S) {
       	int count = 0;
        
       	Set<Character> set = new HashSet<>();
       	for(char c : J.toCharArray())
       		set.add(c);
       	
       	for(char c : S.toCharArray()) {
       		if(set.contains(c))
       			count ++;
       	}
    	
        return count;
    }
}
