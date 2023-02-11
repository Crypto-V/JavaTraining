package com.codility;

import java.util.Arrays;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * */

public class SmallestPossitiveInteger {

    public static void main(String[] args) {
        int [] nums = new int[]{1,2,4,5,6,8};
        System.out.println(solution(nums));
    }
    static int solution(int[] A) {
        int n = A.length;
        boolean[] exists = new boolean[n + 1];

        for (int j : A) {
            if (j > 0 && j <= n) {
                exists[j] = true;
            }
        }
        System.out.println(Arrays.toString(exists));

        for (int i = 1; i <= n; i++) {
            if (!exists[i]) {
                return i;
            }
        }

        return n + 1;
    }
}
