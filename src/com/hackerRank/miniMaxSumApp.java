package com.hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class miniMaxSumApp {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(69);
        numbers.add(2);
        numbers.add(221);
        numbers.add(8974);
        miniMaxSum(numbers);

    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        int maxNumber = 0;
        int minNumber = 0;

        for (int i = 0; i < 4; i++) {
            minNumber += arr.get(i);
        }

        for (int i = arr.size() - 4; i < arr.size(); i++) {
            maxNumber += arr.get(i);
        }
        System.out.print(minNumber + " " + maxNumber);

    }
}
