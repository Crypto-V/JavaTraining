package com.hackerRank2;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[]arrs = {1,3,88,4,2,54,2,5,6};
        InsertionSort.Sort(arrs);
        System.out.println(Arrays.toString(arrs));


    }

    private static void Sort(int[] array) {

        //The first loop iterates over each element in the array, starting from the second element
        for (int i = 1; i < array.length; i++) {
            //The current element is stored in a variable current.
            var current = array[i];
            var j = i - 1;

            //A second loop is used to compare the current element with the previous elements (starting from the element to its left).
//            If the previous element is greater than the current element, it is shifted one position to the right.
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;

        }

    }
}
