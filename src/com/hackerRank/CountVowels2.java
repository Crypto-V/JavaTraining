package com.hackerRank;

public class CountVowels2 {
    public static int getCount(String str) {
        char[] chars = str.toCharArray();
        int count = 0;

        for (char aChar : chars) {
            if (aChar == 'a' || aChar == 'e' || aChar == 'i' || aChar == 'o' || aChar == 'u') {
                count++;
            }
        }
        return count;
    }
}
