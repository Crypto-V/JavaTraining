package com.codewars;

/**
 * Your task is to sort a given string. Each word in the string will contain a single number.
 * This number is the position the word should have in the result.
 * <p>
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * <p>
 * If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 */

public class SortArraysBasedOnNumbers {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

    public static String order(String words) {
        if (words.isEmpty()) return "";

        //Splitting the string based on space.
        String[] strings = words.split(" ");
        String result = "";

        String[] temp = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            temp[getNum(strings[i]) - 1] = strings[i];
        }
        return String.join(" ", temp);
    }


    private static int getNum(String s) {
        //This function will search for the number hidden in the text.
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return Character.getNumericValue(s.charAt(i));
            }
        }
        return 0;
    }
}


