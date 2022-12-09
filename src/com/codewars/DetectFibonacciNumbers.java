package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class DetectFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(800)));

    }
    /**
     * This is a short version of solving the problem that calculates if the two consecutive number in fibonaci list are equal to the given product.
     * */

    public static long[] productFib(long prod) {
        long a = 0L;
        long b = 1L;
        while (a * b < prod) {
            long tmp = a;
            a = b;
            b = tmp + b;
        }
        return new long[] { a, b, a * b == prod ? 1 : 0 };
    }


    /**
     * This is a long version of solving the problem that calculates if the two consecutive number in fibonaci list are equal to the given product.
     * */
//    public static long[] productFib(long prod) {
//        ArrayList<Long> fib = fibonacciList();
//        long x = 0;
//        long y = 0;
//        long flag = 0;
//        long secondX = 0;
//        long secondY = 0;
//
//        for (int i = 0; i < fib.size() -1 ; i++) {
//
//            if ((long) secondX * secondY < prod) {
//                secondX = Math.toIntExact(fib.get(i + 1));
//                secondY = fib.get(i) + fib.get(i + 1);
//
//
//            }
//
//            if ((long) fib.get(i) * fib.get(i + 1) == prod) {
//                x = Math.toIntExact(fib.get(i));
//                y = Math.toIntExact(fib.get(i + 1));
//                flag = 1;
//                break;
//
//            }
//
//        }
//        if (flag == 1) return new long[]{x, y, flag};
//        else return new long[]{secondX, secondY, flag};
//
//    }
//
//    static ArrayList<Long> fibonacciList() {
//        //generating only 15 numbers of fibonacci since its very less chance to pass it.
//        int size = 55;
//        ArrayList<Long> ints = new ArrayList<>(size);
//        ints.add(0L);
//        ints.add(1L);
//        for (int i = 2; i < size; i++) {
//            ints.add(ints.get(i - 1) + ints.get(i - 2));
//        }
//        return ints;
//    }
}
