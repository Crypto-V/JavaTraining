package com.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * The number 89 is the first integer with more than one digit that fulfills the property partially
 * introduced in the title of this kata. What's the use of saying "Eureka"? Because this sum gives the same number:
 * 89=8pow(1)+9pow(2)
 * <p>
 * We need a function to collect these numbers, that may receive two integers a and b that defines the range
 * [a,b] (inclusive) and outputs a list of the sorted numbers in the range that fulfills the property described above.
 **/


public class SumDigPower {

    public static void main(String[] args) {
        System.out.println(sumDigPow(88, 100));
//        System.out.println(checkEureka(10L));
    }

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> resultArray = new ArrayList<>();

        for (long i = a; i <= b; i++) {
            if (checkEureka(i)) {
                resultArray.add(i);
            }
        }
        return resultArray;
    }

    private static boolean checkEureka(Long aLong) {

        //Convert long to string for iterating
        String convertedInt = Long.toString(aLong);

        //Break the number into array of its chars
        List<Character> chars = new ArrayList<>();

        //Loop through the array and check if number could be obtained following the formula
        for (int i = 0; i < convertedInt.length(); i++) {
            chars.add(convertedInt.charAt(i));
        }

        //Create a for loop to iterate over the chars and use the index as a power
        int sum = 0;
        for (int i = 0; i < chars.size(); i++) {
            int charValue = Character.getNumericValue(chars.get(i));
            sum += Math.pow(charValue, i + 1);
        }
        return sum == aLong;
    }
}
