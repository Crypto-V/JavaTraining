package StringAlgorithms;

import java.util.Locale;

public class CustomParsing {

    public static boolean isAtEvenIndex(String s, char item) {

        //Check if the string is not empty, if is empty will return false.
        if (s == null || s.isEmpty() || item == ' ') {
            return false;
        }

        //If you have to check only the even locations there is no point to parse the whole string.
        for (int i = 0; i < s.length() / 2 + 1; i = i + 2) {
            //The loop step will be 2 so will be covering the null pointer exceptions with s.length()/2+1.
            if (s.charAt(i) == item) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(isAtEvenIndex(s,'L'));
    }
}
