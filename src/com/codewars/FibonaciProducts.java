package com.codewars;

import java.util.Arrays;

public class FibonaciProducts {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(800L)));
    }

    public static long[] productFib(long prod) {
        long first = 0;
        long second = 1;
        int status = 0;

        while (first * second < prod) {
            long next = first + second;
            first = second;
            second = next;
        }

        if (first * second == prod) {
            status = 1;
        }

        return new long[]{first, second, status};
    }

}
