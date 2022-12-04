package com.hackerRank;

public class SumIntArray {
    public static void main(String[] args) {

        System.out.println(oddOrEven(new int[]{2,5,34,6}));

    }

    public static String oddOrEven (int[] array) {
        if (array.length == 0) System.out.println("0");
        int result=0;

        for (int j : array) {
            result += j;
        }

        if (result % 2 ==  0) return "even";
        else return "odd";

    }
}
