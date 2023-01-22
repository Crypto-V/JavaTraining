package com.hackerRank;

/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

*/

public class HoursTimeConvertion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:56PM"));
        System.out.println(timeConversion("12:05:56AM"));
        System.out.println(timeConversion("12:45:54PM"));
        System.out.println(timeConversion("23:05:56AM"));
    }

    public static String timeConversion(String s) {
        /**
         * This version is mostly hardcoded just to practice a bit the strings, however it passed all the tests.
         * There will be another better version.
         * Continues Improvement Mfkers.
         * */

        //Prepare string, by inserting the : before the letters, so we can split it after.
        StringBuilder readyString = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == 'P' || s.charAt(i + 1) == 'A') {
                readyString.append(s.charAt(i)).append(":");
            } else readyString.append(s.charAt(i));
        }

        // Split string in hours min,sec and format
        String[] sx = readyString.toString().split(":");
        int hours = Integer.parseInt(sx[0]);
        String minutes = sx[1];
        String seconds = sx[2];
        String format = sx[3];

        if (format.equals("A") && hours <= 11) return sx[0] + ":" + minutes + ":" + seconds;
        else if (format.equals("A") && hours == 12) hours = 24;

        //Check the first letter of the format
        if (format.equals("P") && hours <= 11) {
            hours = hours + 12;
        }

        String finalHour = "";

        if (hours > 23) {
            hours = hours - 24;
            finalHour = "0" + hours;
        } else {
            finalHour = String.valueOf(hours);
        }
        //If is P we add 12 to the hours
        //Check if is greater than 23 we start with 00.
        //Getting al the strings together in the desired format.

        return finalHour + ":" + minutes + ":" + seconds;

    }
}
