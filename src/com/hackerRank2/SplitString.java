package com.hackerRank2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SplitString {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("carbonara")));
    }

    static String[] solution(String s) {
        //Check if the length of the string is even if not append underscore
        StringBuilder sb = new StringBuilder(s);
        if (s.length() % 2 != 0) {
            sb.append("_");
        }
        String newString = sb.toString();

        //Precalculate teh length to avoid List creation so we can use simple array
        int n = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        String[] arrays = new String[n];

        for (int i = 0, j = 0; i < s.length(); i += 2, j++) {
            if (i + 1 < s.length()) {
                arrays[j] = s.substring(i, i + 2);
            } else {
                arrays[j] = s.substring(i) + "_";
            }
        }
        return arrays;
    }

    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("Should handle even string", "[ab, cd, ef]", Arrays.toString(SplitString.solution(s)));
        assertEquals("Should handle even string", "[He, ll, oW, or, ld]", Arrays.toString(SplitString.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string", "[ab, cd, e_]", Arrays.toString(SplitString.solution(s)));
        assertEquals("Should handle odd string", "[Lo, ve, Pi, zz, a_]", Arrays.toString(SplitString.solution(s1)));
    }
}
