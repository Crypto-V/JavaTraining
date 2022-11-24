package com.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;


public class test {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        LinkedList <String> cacheStrings = new LinkedList<>();
        while ((line = in.readLine()) != null) {
            if(line.toLowerCase().equals("add")){
                System.out.println(line);
                if (!cacheStrings.contains(line)){
                    cacheStrings.add(line);
                }
            }
        }
    }
}
