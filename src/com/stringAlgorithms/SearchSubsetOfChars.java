package com.stringAlgorithms;

public class SearchSubsetOfChars {

    public static void parseContents(String s){
        System.out.println("Option 1: ForEach Loop");
        for (char c:s.toCharArray()) {
            System.out.print(c);
        }

        System.out.println("\nOption 2: Regular for loop");
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(s.charAt(i));
        }
    }


    //Searching the subsets of a given string.
    public static void main(String[] args) {
        String s = "HeLLo";

        //Using the contain method is not efficient because is searching teh whole string until the subset is found.
        System.out.println(s.contains("LL"));

        parseContents(s);

    }
}
