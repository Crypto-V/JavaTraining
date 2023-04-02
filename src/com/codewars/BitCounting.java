package com.codewars;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Write a function that takes an integer as input, and returns the number of bits that are equal
 * to one in the binary representation of that number. You can guarantee that input is non-negative.
 *
 * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 *
 * */

public class BitCounting {

    public static void main(String[] args) {
        System.out.println(countBits(10));
    }

    public static int countBits(int n){
        // converting the n into binary representation
        String binaryNumber = Integer.toBinaryString(n);
        char[] chars = binaryNumber.toCharArray();
        int counter = 0;
        for (char aChar : chars) {
            if (aChar == '1') counter++;
        }

        return counter;
    }

    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }
}
