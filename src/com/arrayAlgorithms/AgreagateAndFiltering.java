package com.arrayAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class AgreagateAndFiltering {
    /**
     * Aggregating is the cobination of multiple datasets in one dataset,
     * so in this process filtering is very important.
     */

//Here will be checking each item before adding into new array
    public static int[] findEvenNumbers(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        for (int num : arr2) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] findEvenNum2(int[] arr1, int[] arr2) {
        /*This method will use the streams to do the same thing as method above. */

        IntPredicate isEvenPred = num -> num % 2 == 0;
        return Stream.of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .filter(isEvenPred)
                .toArray();
    }


    public static void main(String[] args) {
        int[] arr1 = {-9, 3, 2, -8, 12, -16, 32};
        int[] arr2 = {0, -3, -2, -8, -35, 40, 32, 20, 7};

        Arrays.stream(findEvenNumbers(arr1, arr2))
                .forEach(System.out::println);

        Arrays.stream(findEvenNum2(arr1, arr2))
                .forEach(System.out::println);
    }
}
