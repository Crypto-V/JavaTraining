package com.hackerRank2;
import java.util.Collections;
import java.util.List;

public class ArrayMedian {
    public static void main(String[] args) {

    }

    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size()/2);
    }
}
