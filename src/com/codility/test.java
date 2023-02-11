package com.codility;

/**
 * Program to reverse the integer and remove the elading zeros Codility Credera*/

public class test {
    public static void main(String[] args) {
        solution(5432100);

    }


    static void solution(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            if (enable_print == 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

}
