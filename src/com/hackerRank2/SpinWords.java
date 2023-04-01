package com.hackerRank2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Write a function that takes in a string of one or more words, and returns the
 * same string, but with all five or more letter words reversed (Just like the name
 * of this Kata). Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * <p>
 * Examples:
 * <p>
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */

public class SpinWords {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));

    }

    public static String spinWords(String sentence) {
        // Split the sentence into an array of words using the space character as a delimiter
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        // Loop through each word in the array
        for (String word : words) {
            // If the word has a length greater than or equal to 5, reverse it and append to the result
            if (word.length() >= 5) {
                result.append(new StringBuilder(word).reverse());
            }
            // Otherwise, just append the word as is
            else {
                result.append(word);
            }
            // Append a space to separate the words
            result.append(" ");
        }
        // Remove the trailing space and return the result as a string
        return result.toString().trim();
    }


    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}
