package com.codewars;

import java.util.stream.IntStream;

public class NumberPresenceInArray {
     static boolean exists(int[] ints, int k){

         return  IntStream.of(ints)
                 .anyMatch(x -> x == k);


     }

    public static void main(String[] args) {

        System.out.println(exists(new int[]{-9,14,37,102},102));
    }


}
