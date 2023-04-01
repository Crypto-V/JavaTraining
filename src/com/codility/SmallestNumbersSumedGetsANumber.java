package com.codility;

class SmallestNumbersSummedGetsANumber {
    public static void main(String[] args) {
        System.out.println(solution(7));
    }

    public static int solution(int N) {
        int i = 1;
        while (1 != 0) {
            // Checking if number has
            // sum of digits = N
            if (getSum(i) == N) break;
            i++;
        }

        return i;
    }

    // Function to get sum of digits
    public static int getSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }


}