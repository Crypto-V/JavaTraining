package com.codewars;

/**
 * The input is a string str of digits. Cut the string into chunks
 * (a chunk here is a substring of the initial string) of size sz
 * (ignore the last chunk if its size is less than sz).
 * <p>
 * If a chunk represents an integer such as the sum of the cubes of its digits is divisible by 2,
 * reverse that chunk; otherwise rotate it to the left by one position.
 * Put together these modified chunks and return the result as a string.
 * <p>
 * If
 * <p>
 * sz is <= 0 or if str is empty return ""
 * sz is greater (>) than the length of str it is impossible to take a chunk of size sz hence return "".
 */
public class stringChunks {
    public static void main(String[] args) {
        System.out.println(revRot("733049910872815764", 5));


    }

    public static String revRot(String strng, int sz) {
        if (strng.isEmpty() || sz == 0 || sz > strng.length()) return "";

        int lastIndexOfWorkable = strng.length() - (strng.length() % sz);
        String workable = strng.substring(0, lastIndexOfWorkable);

        StringBuilder result = new StringBuilder();
        int start = 0;
        int step = sz;
        int upTo = workable.length();

        while (start != upTo) {
            String inLoopString = workable.substring(start, sz);
            if (isDivisibleByTwo(inLoopString)) {
                result.append(reverse(inLoopString));

            } else {
                result.append(shiftLeft(inLoopString));

            }
            start = start + step;
            sz += step;

        }

        return result.toString();
    }

    static String reverse(String s) {
        StringBuilder newString = new StringBuilder(s);
        newString.reverse();
        return newString.toString();
    }

    static String shiftLeft(String s) {
        String temp = s.substring(0, 1);

        return s.substring(1) + temp;
    }

    static boolean isDivisibleByTwo(String s) {


        int cubic = 0;
        for (int i = 0; i < s.length(); i++) {
            cubic += Math.pow(Integer.parseInt(s.substring(i, i + 1)), 3);
        }
        return cubic % 2 == 0;
    }
}
