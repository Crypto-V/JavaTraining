package com.codility;

/**
 * we call a password secure if it contains no space charachters and consists
 * of at least six chars, including at least one digit, one lowercase letter,
 * one uppercase letter and one special char. Write a function that given a
 * string S of length n returns tru if S is secure and false if is not. in java
 */

public class CheckPassword {
    public static void main(String[] args) {
        String s = "FooBar123!";
        System.out.println(solution(s));

    }

    static boolean solution(String S) {
        //At least 6 chars long.
        if (S.length() < 6) return false;

        //At least One Digit
        boolean hasDigit = false;

        //At least one lowercase
        boolean hasLowerCase = false;

        //At least one uppercase letter
        boolean hasUpperCase = false;

        //Has Special char.
        boolean hasSpecialChar = false;


        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (c == '!' || c == '$' || c == '#' || c == '@' || c == '%' || c == '^' || c == '&' || c == '*' || c == '(' || c == ')' || c == '_') {
                hasSpecialChar = true;
            } else if (Character.isWhitespace(c)) {
                return false;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;

        //It also can be done by using RE:
        //     Pattern pattern =
        // Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\\$%\\^&\\*]) [\\S]{6,}$");
        // Matcher matcher = pattern.matcher(password);
        //import java.util.regex.Matcher;
        //import java.util.regex.Pattern;

    }
}
