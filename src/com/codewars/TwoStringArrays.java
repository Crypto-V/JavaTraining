package com.codewars;

import static java.lang.Integer.parseInt;

/**
 * A bookseller has lots of books classified in 26 categories labeled A, B, ... Z.
 * Each book has a code c of 3, 4, 5 or more characters.
 * The 1st character of a code is a capital letter which defines the book category.
 * <p>
 * In the bookseller's stocklist each code c is followed by a space and by a positive
 * integer n (int n >= 0) which indicates the quantity of books of this code in stock.
 */

public class TwoStringArrays {
    public static void main(String[] args) {
        System.out.println(stockSummary(
                new String[]{"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"},
                new String[]{"R", "D", "X"})

        );
    }


    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        StringBuilder result = new StringBuilder();
        int sum = 0;
        String space = " - ";

        for (String letter : lstOf1stLetter) {
            result.append("(").append(letter).append(" : ");
            for (int i = 0; i < lstOfArt.length; i++) {
                int spaceIndex = lstOfArt[i].indexOf(' ') + 1;

                if (letter.charAt(0) == lstOfArt[i].charAt(0)) {
                    sum = sum + parseInt(lstOfArt[i].substring(spaceIndex));
                }
            }
            result.append(sum).append(")").append(space);
            sum = 0;
        }
        //Removing the last 3 chars ( - )
        return result.substring(0, result.length() - 3);
    }
}
