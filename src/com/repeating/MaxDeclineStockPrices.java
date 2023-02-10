package com.repeating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MaxDeclineStockPrices {
    public static void main(String[] args) throws IOException {
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String[] nums = in.readLine().split(" ");

        int p = 42;
        int a = 1;
        int b = 23;
        int c = 4;
        int d = 8;
        int n = 10;

//        int p = Integer.parseInt(nums[0]);
//        int a = Integer.parseInt(nums[1]);
//        int b = Integer.parseInt(nums[2]);
//        int c = Integer.parseInt(nums[3]);
//        int d = Integer.parseInt(nums[4]);
//        int n = Integer.parseInt(nums[5]);

        // Calculate the first price
        double price = p * (Math.sin(a + b) + Math.cos(c + d) + 2);
        double maxPrice = Math.ceil(price);
        double maxDecline = 0;

        // Calculate the rest of the prices and keep track of value of the maxDecline
        for (int i = 2; i <= n; i++) {
            price = p * (Math.sin(a * i + b) + Math.cos(c * i + d) + 2);
            double currentPrice = Math.ceil(price);
            if (currentPrice > maxPrice) {
                maxPrice = currentPrice;
            } else {
                maxDecline = Math.max(maxDecline, maxPrice - currentPrice);
            }
        }
        System.out.println(maxDecline);

    }
}
