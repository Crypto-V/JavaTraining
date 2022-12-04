package com.hackerRank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReturnMinimumNotInList {
    public static void main(String[] args) {
        int x = solution(new int[]{1, 2, 4,6, 5, 3});
        int y = solution(new int[]{1, -1,2, 3,6, 5, 3,64,0});
        int z = solution(new int[]{1, 2, 3,4,-6, 5, 3});
        int d = solution(new int[]{-1, -2, -3,-6, -5, -13});
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);
    }


    public static int solution(int[] A) {
        int number = 0;
        int N = A.length;

        //Creating a set to remove duplicates.
        Set<Integer> set = new HashSet<>();

        //Getting all the positive numbers from the list A and adding to the set.
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }

        //If list has left only 3 values but the list had initially 10 values that the than will compare the numbers
        // with the size of the array indexes and get the lowest number found.
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                number = i;
                break;
            }
        }

        return number;

    }
}