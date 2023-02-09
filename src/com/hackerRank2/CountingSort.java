package com.hackerRank2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CountingSort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(63, 54, 17, 78, 43, 70, 32, 97, 16, 94, 74, 18, 60, 61, 35, 83, 13,
                56, 75, 52, 70, 12, 24, 37, 17, 0, 16, 64, 34, 81, 82, 24, 69, 2, 30, 61, 83, 37, 97, 16, 70, 53,
                0, 61, 12, 17, 97, 67, 33, 30, 49, 70, 11, 40, 67, 94, 84, 60, 35, 58, 19, 81, 16, 14, 68, 46, 42,
                81, 75, 87, 13, 84, 33, 34, 14, 96, 7, 59, 17, 98, 79, 47, 71, 75, 8, 27, 73, 66, 64, 12, 29, 35, 80,
                78, 80, 6, 5, 24, 49, 82);
        System.out.println(countingSort(numbers));
    }

    public static List<Integer> countingSort(List<Integer> arr) {
        int maxValue = Collections.max(arr);
        int[] counters = new int[maxValue+1];

        for (int target : arr) {
            counters[target]++;
        }

        List<Integer> result = new ArrayList<>(counters.length);
        for (int i=0; i< counters.length ; i++) {
            result.add(counters[i]);
        }
        return result;
//        return sort(result);
    }

    public static List<Integer> sort(List<Integer> counters) {
        List<Integer> sorted = new ArrayList<>(counters.size());

        for (int i = 0; i < counters.size(); i++) {
            int count = counters.get(i);
            for (int j = 0; j < count; j++) {
                sorted.add(i);
            }
        }
        return sorted;
    }
}
