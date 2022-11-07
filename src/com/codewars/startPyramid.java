package com.codewars;

import java.util.Arrays;

public class startPyramid {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(towerBuilder(5)));

        String [] arry = towerBuilder(1);
        for (String arr: arry) {
            System.out.println(arr);
        }

    }

    public static String[] towerBuilder(int nFloors) {
        String[] christmasTree = new String[nFloors];
        if(nFloors == 1) return new String[]{"*"};

        int n= 1;


        // Outer loop to handle number of rows
        for (int i = 0; i < nFloors; i++) {
            String space = "";
            space += " ".repeat(nFloors-i);
            space += "*".repeat(n+i);
            space += " ".repeat(nFloors-i);
            christmasTree[i] = space;
            n++;

        }


        return christmasTree;
    }
}
