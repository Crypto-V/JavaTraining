package com.hackerRank;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] list= new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(createPhoneNumber(list));

    }

    public static String createPhoneNumber(int[] numbers) {
        if(numbers.length < 10) return "number too short";
        return "("+numbers[0]+numbers[1]+numbers[2]+") "+numbers[3]
                +numbers[4]+numbers[5]+"-"+numbers[6]+numbers[7]+numbers[8]+numbers[9];
    }
}
