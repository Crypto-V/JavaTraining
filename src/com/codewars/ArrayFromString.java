/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the
 * missing second character of the final pair with an underscore ('_').
 * */

package com.codewars;

import java.util.Arrays;

public class ArrayFromString {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("asfagga")));
    }

    public static String[] solution(String s) {

        /*
          This is a short version on how to solve the problem
          */

        s = (s.length() % 2 == 0) ? s : s + "_";
        return s.split("(?<=\\G.{2})");
    }


    /*
      This is a long version on how to solve the problem
      */
//        // if not even, then add an underscore to the end
//        if (s.length() % 2 != 0) {
//            s += "_";
//        }
//
//        // determine the space needed for the return array
//        int sizeArray = s.length() / 2;
//
//        // create a new array to populate and return
//        String[] out = new String[sizeArray];
//
//        // create a builder index
//        int count = 0;
//
//        // loop through the input string
//        for (int i = 0; i < s.length(); i++) {
//
//            // create a new string to build
//            StringBuilder sb = new StringBuilder();
//            // add the current item
//            sb.append(s.charAt(i));
//            // add the next item
//            sb.append(s.charAt(i + 1));
//
//            // populate our output string as we go
//            out[count] = sb.toString();
//
//            // increment both counters
//            i++;
//            count++;
//        }
//
//        // return the built string
//        return out;
//    }
}

