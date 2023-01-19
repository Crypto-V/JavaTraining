package com.hackerRank;

public class CheckPalindromThatCanBecreated {

    public static void main(String[] args) {

    }

    public static StringBuilder solution(String S) {

        if (isPalindrome(S)) return new StringBuilder(S);
        if (S.isEmpty()) return new StringBuilder("");
        char ch;

        StringBuilder newString = new StringBuilder();

        for (int i = 0; true; i++) {
            if (S.charAt(i) == '?') {
                for (ch = 'a'; ch <= 'z'; ch++) {
                    newString.append(ch);
                }

            }else{
                newString.append(S.charAt(i));
            }

            if(isPalindrome(String.valueOf(newString))) return newString;
            else return new StringBuilder("NO");
        }


    }


    static boolean isPalindrome(String S) {
        String res = "";
        boolean answer = false;

        for (int i = S.length() - 1; i >= 0; i--) {
            res = res + S.charAt(i);
        }

        if (S.equals(res)) answer = true;

        return answer;
    }
}

