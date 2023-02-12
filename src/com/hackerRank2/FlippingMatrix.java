package com.hackerRank2;


import java.util.ArrayList;
import java.util.List;

public class FlippingMatrix {
    public static void main(String[] args) {
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);

        List<Integer> row2 = new ArrayList<>();
        row2.add(3);
        row2.add(4);

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(row1);
        matrix.add(row2);
        System.out.println(flippingMatrix(matrix));


    }
    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Calculate the number of rows and columns to be considered in the top-left quadrant of the matrix
        int n = matrix.size() / 2;

        // Initialize the result to 0
        int result = 0;

        // Loop over the top-left quadrant of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Calculate the maximum of the four elements in the corresponding quadrants in the original matrix
                result += Math.max(
                        // Maximum of the top-left and bottom-right elements
                        Math.max(matrix.get(i).get(j), matrix.get(i).get(matrix.size() - 1 - j)),
                        // Maximum of the top-right and bottom-left elements
                        Math.max(matrix.get(matrix.size() - 1 - i).get(j), matrix.get(matrix.size() - 1 - i).get(matrix.size() - 1 - j))
                );
            }
        }

        // Return the result, which is the maximum sum that can be obtained by flipping the elements of the matrix
        return result;
    }
}
