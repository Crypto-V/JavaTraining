package com.repeating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String[] line = in.readLine().split(" ");

        String str1 = line[0];
        String str2 = line[1];


        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        // Check if the length of the two strings is not equal, return false
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to lowercase and sort the characters
        char[] s1 = str1.toLowerCase().toCharArray();
        char[] s2 = str2.toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        // Check if both sorted arrays are equal
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i]) {
                return false;
            }
        }

        return true;
    }
}
