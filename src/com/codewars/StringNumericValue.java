package com.codewars;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringNumericValue {


    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));

//        char s = 'w';
//        char s1 = 'o';
//        char s2 = 'o';
//        char s3 = 'd';
//        char s4 = 's';
//        System.out.println("Manual calculated values");
//        System.out.println(Character.getNumericValue(s)+
//                        Character.getNumericValue(s)+
//                        Character.getNumericValue(s1)+
//                        Character.getNumericValue(s2)+
//                        Character.getNumericValue(s3)+
//                        Character.getNumericValue(s4)
//
//                );
    }

    public static String high(String s) {
        int winner = 0;
        int sum = 0;
        int index = 0;
        String[] splitedStrings = s.split(" ");


        for (int i = 0; i < splitedStrings.length; i++) {
            splitedStrings[i] = dupRemove(splitedStrings[i]);
            System.out.println(Arrays.toString(splitedStrings));
        }

        for (int i = 0; i < splitedStrings.length; i++) {
            dupRemove(splitedStrings[i]);
            for (int j = 0; j < splitedStrings[i].length(); j++) {
                sum = sum + Character.getNumericValue(splitedStrings[i].charAt(j));
            }

            if(sum > winner){
                winner = sum;
                index = i;
                sum = 0;

            }
        }

        return splitedStrings[index];
    }

    static String dupRemove(String s) {
        s = s.toLowerCase();

        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String j = s.substring(i, i + 1);
            if (clean.indexOf(j) == -1) {
                clean.append(j);
            }
        }
        return clean.toString();
    }

}
