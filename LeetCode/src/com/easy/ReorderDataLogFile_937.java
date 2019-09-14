package com.easy;

import java.util.Arrays;

public class ReorderDataLogFile_937 {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (log1, log2) ->  {
            String word1 = log1.substring(log1.indexOf(" ") + 1);
            String words1[] = word1.split("\\s");
            String word2 = log1.substring(log2.indexOf(" ") + 1);
            String words2[] = word2.split("\\s");

            boolean alpha1 = Character.isAlphabetic(words1[0].charAt(0));
            boolean alpha2 = Character.isAlphabetic(words2[0].charAt(0));

            if(!alpha1 && !alpha2)
                return 1;
            if(!alpha1)
                return -1;
            if(!alpha2)
                return 1;

            int compare = word1.compareTo(word2);

            if(compare == 0)
                compare = log1.substring(0, log1.indexOf(" ")).compareTo(log2.substring(0, log2.indexOf(" ")));

            return compare;
        });

        return logs;

    }
}
