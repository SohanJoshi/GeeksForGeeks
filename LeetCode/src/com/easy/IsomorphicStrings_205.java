package com.easy;

public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;

        int mapping[] = new int[512];

        for(int i = 0; i < s.length(); i++)
        {
            int indexS = s.charAt(i);
            int indexT = t.charAt(i);
            if(mapping[indexS] == 0 && mapping[indexT + 256] == 0)
                mapping[indexS] = mapping[indexT + 256] = i + 1;
            if(mapping[indexS] !=  mapping[indexT + 256])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings_205().isIsomorphic("foo", "bar"));
        System.out.println(new IsomorphicStrings_205().isIsomorphic("add", "egg"));
        System.out.println(new IsomorphicStrings_205().isIsomorphic("foo", "baa"));
        System.out.println(new IsomorphicStrings_205().isIsomorphic("title", "paper"));
        System.out.println(new IsomorphicStrings_205().isIsomorphic("aa", "ab"));
        System.out.println(new IsomorphicStrings_205().isIsomorphic("aa", "42"));
        System.out.println(new IsomorphicStrings_205().isIsomorphic("13", "42"));
    }
}
