package com.easy;

import java.util.Arrays;

public class ReorderDataLogFile_937 {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (log1, log2) ->  {
            int index1 = log1.indexOf(" ");
            int index2 = log2.indexOf(" ");

            String words1 = log1.substring(index1 + 1);
            String words2 = log2.substring(index2 + 1);

            boolean isAlpha1 = Character.isAlphabetic(words1.charAt(0));
            boolean isAlpha2 = Character.isAlphabetic(words2.charAt(0));

            if(!isAlpha1 && !isAlpha2)
                return 0;
            if(!isAlpha1)
                return 1;
            if(!isAlpha2)
                return -1;

            int compare = words1.compareTo(words2);

            if(compare != 0)
                return compare;

            String iden1 = log1.substring(0, index1);
            String iden2 = log2.substring(0, index2);

            return iden1.compareTo(iden2);
        });

        return logs;

    }
}
