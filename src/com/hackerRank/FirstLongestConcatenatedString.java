package com.hackerRank;

import java.util.Arrays;

public class FirstLongestConcatenatedString {

    public static void main(String[] args) {

        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"},3));

    }

    public static String longestConsec(String[] strarr, int k) {
        if (k<=0 || k> strarr.length) return "";
        int counter= 0;

        String [] concatenatedString = new String[strarr.length-1];

        for (int i = 0; i < strarr.length-1; i++) {

        }

        return Arrays.toString(concatenatedString);
    }
}
