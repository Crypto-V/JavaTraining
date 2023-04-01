package com.hackerRank2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DashToCamel {
    public static void main(String[] args) {
        System.out.println(toCamelCase("sasasti_sucre-sasati"));
    }

    public static String toCamelCase(String s) {
        // Check if the input string contains any non-alphanumeric characters
        if (!s.matches(".*[^\\p{Alnum}].*")) {
            // If not, return the input string as is
            return s;
        }

        // Create a StringBuilder with the input string
        StringBuilder camelCase = new StringBuilder(s);

        // Loop through each character in the StringBuilder
        for (int i = 0; i < camelCase.length(); i++) {
            // Check if the character is a non-alphanumeric character
            if (!Character.isLetterOrDigit(camelCase.charAt(i))) {
                // If it is, delete the character
                camelCase.deleteCharAt(i);
                // Replace the next character with its uppercase version
                camelCase.replace(i, i+1, String.valueOf(Character.toUpperCase(camelCase.charAt(i))));
            }
        }

        // Return the modified StringBuilder as a String
        return camelCase.toString();
    }

    @Test
    public void testEmptyString() {
        String input = "euProsta_incerc-saVad";
        System.out.println("input: "+input);
        assertEquals("euProstaIncercSaVad", DashToCamel.toCamelCase(input));
    }

}
