package com.codewars;

public class test {
    public static void main(String[] args) {
        String x = "Vasile";
        String y = "";

        for (int i = 0; i < x.length(); i++) {
            y = x.charAt(i)+y;
        }
        System.out.println(y);
    }
}
