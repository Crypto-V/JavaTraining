package com.hackerRank;

public class XXXandOOO {

    public static void main(String[] args) {
        String x = solution("XOXXXOOOXOOO");

        System.out.println(x);

    }

    static String solution(String S) {
        int countX = 0;
        int countO = 0;

        if (S.contains("XXX")) {
            countX += 1;
        }
        if (S.contains("OOO")) {
            countO += 1;
        }

        if (countX == 1 && countO == 1) {
            return "tie";
        } else if (countX == 1) {
            return "X";
        } else if (countO == 1) {
            return "O";
        } else {
            return "tie";
        }

    }
}
