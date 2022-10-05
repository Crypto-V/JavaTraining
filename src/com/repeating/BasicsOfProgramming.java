package com.repeating;

public class BasicsOfProgramming {
    public static void main(String[] args) {
        //1. Write a function that takes a value n returns the sum of numbers 1 to n
        System.out.println(sum(4));

        //write a function that computes the factorial
        System.out.println("Factorial is : " + fact(3));

        //write 3 functions that return the min ,max and avg of the array
        int[] numbers = {5, -2, 0, 234, -438, 63};
        System.out.println("Min number is: " + findMin(numbers));
        System.out.println("Max is : " + findMax(numbers));
        System.out.println("Avg: " + findAvg(numbers));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            System.out.println(i + "  :  " + sum);
        }
        return sum;
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return fact(n - 1) * n;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findAvg(int[] arr) {
        //take sum devide by number of elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("Sum= " + sum);
        return sum / arr.length;
    }
}
