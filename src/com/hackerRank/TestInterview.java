package com.hackerRank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestInterview {

    public static void main(String[] args) {
        String test="Lets do some coding in Java";

        LinkedList<String> someA = new LinkedList<>(Arrays.asList(test.split(" ")));

        System.out.println(someA);
    }
}
