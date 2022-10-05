package com.codewars;

public class Pangram {

    public static boolean check(String sentence) {

        sentence = sentence.toLowerCase();

        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!sentence.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        return allLetterPresent;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }

}
