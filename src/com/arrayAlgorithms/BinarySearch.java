package com.arrayAlgorithms;

import java.util.Arrays;

public class BinarySearch {
    //    If sorted.... O(log(n)) times

    public static boolean binarySearchOne(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (item == arr[mid]) {
                return true;
            } else if (item < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearchOne(arr,1));
        System.out.println(binarySearchOne(arr,4));
        System.out.println(binarySearchOne(arr,123));

//        This is already created and can be used using the Arrays.binarySearch

        System.out.println("Found at index: "+Arrays.binarySearch(arr,3));
    }


}
