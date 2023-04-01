package com.hackerRank2;


public class BubbleSort {

    public static void main(String[] args) {
        System.out.println(sortDesc(123415));

    }

    public static int sortDesc(final int num) {
        //convert number into array of digits
        int[] digits = String.valueOf(num).chars().map(c -> c - '0').toArray();

        for (var i = 0; i < digits.length; i++) {
            for (var j = 1; j < digits.length; j++) {
                if (digits[j] > digits[j - 1]) {
                    swap(digits, j, j - 1);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }

        return Integer.parseInt(result.toString());

    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
