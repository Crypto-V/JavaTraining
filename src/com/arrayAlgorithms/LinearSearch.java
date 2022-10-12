package com.arrayAlgorithms;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearch {

    //Simple linear search using foreach loop O(n)
    public static boolean linearSearchAlgo(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) return true;
        }

        return false;
    }

    //    Linear Search using streams
    public static OptionalInt linearSearchAlgo2(int[]arr, int item){
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(linearSearchAlgo(arr, 1));
        System.out.println(linearSearchAlgo(arr, 8));
        linearSearchAlgo2(arr,1).ifPresent(System.out::println);
        linearSearchAlgo2(arr,8).ifPresent(System.out::println);
    }
}


