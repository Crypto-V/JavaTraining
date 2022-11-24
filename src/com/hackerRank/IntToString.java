/**
 * You are given an integer , you have to convert it into a string.
 *
 * Please complete the partially completed code in the editor.
 * If your code successfully converts  into a string  the code will print "Good job".
 * Otherwise it will print "Wrong answer".
 *
 *  can range between -100 to 100 inclusive.
 *  **/



package com.hackerRank;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();


        try {
            if (number <= 100 && number > -100) {
                String s = Integer.toString(number);
                if (s instanceof String) {
                    System.out.println("Good job");
                }
            }
        } catch (Exception e) {
            System.out.println("Operation was unsuccessful " + e);
        }

    }
}
