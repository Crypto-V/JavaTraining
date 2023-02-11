package com.codility;

import java.util.stream.IntStream;

/**
 * The minimum cost removing one of two similar chars in the string*/

public class CostOfDeletion {
    public static void main(String[] args) {
        System.out.println(solution("abccbd", new int[]{0, 1, 2, 3, 4, 5}));

    }

    static int solution(String S, int[] C) {
//        int cost = 0;
//
//        int pairsCount = IntStream.range(0, S.length() - 1)
//                .filter(i -> S.charAt(i) == S.charAt(i + 1))
//                .map(i -> 1)
//                .sum();
//
//        //Iterating over the list of prices.
//        for (int i = 0; i < C.length - 1; i++) {
//            int pairsCounted = 0;
//            for (int j = 0; j < S.length() - 1; j++) {
//                if (S.charAt(j) == S.charAt(j + 1)) {
//                    cost += Math.min(C[j], C[j + 1]);
//                    pairsCounted++;
//                }
//            }
//            if (pairsCounted == pairsCount) break;
//
//        }
//        return cost;

        int cost = 0;

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                cost += Math.min(C[i], C[i + 1]);
            }
        }
        return cost;
    }
}
