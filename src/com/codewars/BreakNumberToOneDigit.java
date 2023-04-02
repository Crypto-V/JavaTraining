package com.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative
 * persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 * <p>
 * For example (Input --> Output):
 * <p>
 * 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
 */

public class BreakNumberToOneDigit {

    public static int persistence(long n) {
        int counter = 0;
        while (n >= 10) {
            long product = 1;
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            n = product;
            counter++;
        }
        return counter;
    }

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");

        assertEquals(4, BreakNumberToOneDigit.persistence(999));

    }

}
