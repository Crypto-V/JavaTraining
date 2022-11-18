package com.codewars;

import java.util.Scanner;

public class SequenceNumbers {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int total;

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            total = a;

            for (int j = 0; j < n; j++) {
                total += (int) (Math.pow(2, j) * b);
                System.out.print(total + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
