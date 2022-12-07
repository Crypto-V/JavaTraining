package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Assuming that string are similar if all the characters are similar in 2 strings of the array
 * return how many pair of strings are there!*/

public class SimilarArrays {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("London", "Tokyo", "New York", "noLod","oykto"));
        System.out.println(compareWords(words));


    }

    public static long compareWords(List<String> str) {
        int index = 0;
        int count = 0;

        while (index != str.size()) {
            for (int i = 1; i < str.size() - 1; i++) {
                String str1 = dupRemove(str.get(index));
                String str2 = dupRemove(str.get(i));

                if (check(str1, str2)) count++;

            }
            index++;
        }
        return count/2;
    }


    static boolean check(String a, String b) {
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }

    static String dupRemove(String s) {
        s = s.toLowerCase();

        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String j = s.substring(i, i + 1);
            if (clean.indexOf(j) == -1) {
                clean.append(j);
            }
        }
        return clean.toString();
    }
}
