package com.hackerRank;

public class StringSortNumber {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {
        //Checking for empty string.
        if (words.isEmpty()) return "";

        StringBuilder finalString = new StringBuilder();

        // Split in multiple words
        String[] spliters = words.split(" ");

        //Find the number in each word
        int number = 1;
        while (number <= spliters.length) {
            for (String spliter : spliters) {
                if (spliter.contains(Integer.toString(number))) {
                    finalString.append(spliter).append(" ");
                    number++;
                }
            }
        }
        return finalString.toString().stripTrailing();
    }
}
