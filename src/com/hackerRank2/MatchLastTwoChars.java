package com.hackerRank2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatchLastTwoChars {

    public static void main(String[] args) {
        System.out.println(solution("abc", "d"));
    }


    public static boolean solution(String str, String ending) {
        return ending.length() <= str.length() && str.endsWith(ending);
    }

    private static void check(String str, String ending, boolean expected) {
        boolean result = MatchLastTwoChars.solution(str, ending);
        assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
    }

    @Test
    public void staticTests() {
        check("abc", "bc", true);
        check("abc", "d", false);
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }


}
