package com.hackerRank2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;




public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, -12)
        );
        System.out.println(arr);

        System.out.println(diagonalDifference(arr));

    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        /**
         * Loop version
         * */
//        int leftToRightSum = 0;
//        int rightToLeftSum = 0;
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.get(i).size(); j++) {
//                if (i == j) {
//                    leftToRightSum += arr.get(i).get(j);
//                }
//                if (i + j == arr.size() - 1) {
//                    rightToLeftSum += arr.get(i).get(j);
//                }
//            }
//        }
//        return Math.abs(leftToRightSum - rightToLeftSum);

        /**
         * Using Streams
         * */
        int leftToRightSum = IntStream.range(0, arr.size())
                .map(i -> arr.get(i).get(i))
                .sum();
        int rightToLeftSum = IntStream.range(0, arr.size())
                .map(i -> arr.get(i).get(arr.size()-1-i))
                .sum();

        return Math.abs(leftToRightSum - rightToLeftSum);

    }

}
