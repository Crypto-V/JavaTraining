package com.codewars;

public class PhoneNumber {

    public static void main(String[] args) {


    }

    public static String solution(String[] phone_numbers, String[] phone_owners, String number) {
        for (int i = 0; i < phone_numbers.length; i++) {

            for (int j = 0; j < phone_owners.length; j++) {

                if (phone_numbers[i].contains(number)) {
                    return phone_owners[i];
                } 
            }
        }

        return number;
    }
}
