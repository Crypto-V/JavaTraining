package com.stringAlgorithms;

public class ValidationAlgorithms2 {
    //Validating more complex strings such as checking if the string contain a digit or at least one uppercase letter and so on.

    public static boolean isPasswordComplex(String s){

//        Checking if the string has at least one upper case , at least one lower and at least one digit.
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isDigit);


    }

    public static void main(String[] args) {

        System.out.println(isPasswordComplex("Hell0"));
        System.out.println(isPasswordComplex("Hello"));
        System.out.println(isPasswordComplex("HelLo"));
        System.out.println(isPasswordComplex("HELL0"));
        System.out.println(isPasswordComplex("hell0"));
        System.out.println(isPasswordComplex(""));

    }


}
