package com.codewars;

import java.util.Arrays;

public class BiggestInteger {
    public static void main(String[] args) {

        System.out.println(biggestInt("1256220968285267342822553"));
    }

    private static String biggestInt(String s) {
        char [] x = s.toCharArray();
        Arrays.sort(x);
        StringBuilder result = new StringBuilder();

        for (int i = x.length-1; i >= 0 ; i--) {
            result.append(x[i]);
        }

        return result.toString();


    }
}
