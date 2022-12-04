package com.streams.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //Exemple of java normal way of getting the result.
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09845673291"));
        System.out.println(isPhoneNumberValid("0784567329"));

        //Example using predicate
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09845673291"));
        System.out.println(isPhoneNumberValidPredicate.test("0784567329"));

        System.out.println("Is phone number valid and contains 3 = "+
                isPhoneNumberValidPredicate
                        .or(containsNumber3)
                        .test("07845670293")
        );

        System.out.println("Is phone number valid and contains 3 = "+
                isPhoneNumberValidPredicate
                        .and(containsNumber3)
                        .test("07000000000")
        );
    }

    //Exemple of java normal way of getting the result.
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07")
                && phoneNumber.length() == 11;
    }

    //Example using predicate
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
