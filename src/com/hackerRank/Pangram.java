package com.hackerRank;

import java.util.List;

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


    public static String isPangram(List<String> pangram) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < pangram.size(); i++) {
            boolean allLetterPresent = true;
            String tryy = pangram.get(i).toLowerCase();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (!tryy.contains(String.valueOf(ch))) {
                    allLetterPresent = false;
                    break;
                }
            }

            if(allLetterPresent) result.append(1);
            else result.append(0);
        }

        return result.toString();
    }

}
