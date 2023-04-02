package com.codewars;

import java.util.*;

/**
 * Given a string of words, you need to find the highest scoring word.
 * <p>
 * Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
 * <p>
 * You need to return the highest scoring word as a string.
 * <p>
 * If two words score the same, return the word that appears earliest in the original string.
 * <p>
 * All letters will be lowercase and all inputs will be valid.
 */

public class HighestScoringWord {


    public static void main(String[] args) {
        System.out.println(high("b aa"));

    }

//    public static String high(String s) {
//        if (s.isEmpty()) return "";
//        return Arrays.stream(s.split(" "))
//                .max(Comparator.comparingInt(word -> word.chars().map(charr -> charr - 96).sum()))
//                .get();
//    }

    public static String high(String s) {
        //split words
        String[] words = s.split(" ");

        //Create variable to store highest score for comparation and the highestscoring word
        String highestScoringWord = "";
        int highestScore = 0;

        //looping through words and chars
        for (String word : words) {
            int score = 0;

            for (char c : word.toCharArray()) {
                score += c - 'a' + 1;
            }

            if (score > highestScore) {
                highestScore = score;
                highestScoringWord = word;
            }
        }

        return highestScoringWord;
    }

}
