package com.hackerRank;

/*The program will calculate the probability of positive, negative and zero numbers from the given array*/

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(1);
        numbers.add(0);
        numbers.add(-2);
        numbers.add(5);
        plusMinus(numbers);
    }

    public static void plusMinus(List<Integer> arr) {
        double negativeCount = 0;
        double positiveCount = 0;
        double zeroCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) negativeCount++;
            else if (arr.get(i) > 0) positiveCount++;
            else zeroCount++;
        }
        System.out.printf("%.6f%n", negativeCount / arr.size());
        System.out.printf("%.6f%n", positiveCount / arr.size());
        System.out.printf("%.6f%n", zeroCount / arr.size());

    }
}
