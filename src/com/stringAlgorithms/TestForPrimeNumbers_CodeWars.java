package com.stringAlgorithms;

public class TestForPrimeNumbers_CodeWars {

    public static boolean isPrime(int n) {
        //Checking if the value of n is lower than 1 and returning false since are not prime.
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
