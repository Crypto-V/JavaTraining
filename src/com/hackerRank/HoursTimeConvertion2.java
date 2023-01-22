package com.hackerRank;
import java.util.HashMap;
import java.util.Map;

public class HoursTimeConvertion2 {
    public static void main(String[] args) {
        System.out.println(timeConversion("02:05:56PM"));
        System.out.println(timeConversion("06:40:03AM"));
        System.out.println(timeConversion("04:45:54PM"));
    }

    public static String timeConversion(String s) {

        /**
         * Time converting using HashMap
         * */

        //Associating the values in a dictionary.
        Map<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("01", "13");
        dictionary.put("02", "14");
        dictionary.put("03", "15");
        dictionary.put("04", "16");
        dictionary.put("05", "17");
        dictionary.put("06", "17");
        dictionary.put("07", "19");
        dictionary.put("08", "20");
        dictionary.put("09", "21");
        dictionary.put("10", "22");
        dictionary.put("11", "23");

        //Getting the ready String in format hh:mm:ss
        String[] readyStringArray = prepareAndSplitTime(s);
        String format = readyStringArray[3];
        String hours = readyStringArray[0];
        StringBuilder finalHour = new StringBuilder();

        if (format.equals("A") && Integer.parseInt(hours) == 12) finalHour.append("00");
        else if (format.equals("A")) {
            return hours + ":" + readyStringArray[1] + ":" + readyStringArray[2];
        }


        if (format.equals("P")) {
            for (String key : dictionary.keySet()) {
                if (key.equals(hours)) {
                    finalHour = new StringBuilder(dictionary.get(key));
                }
            }
            if (Integer.parseInt(hours) == 12) finalHour.append("12");
        }


        return finalHour + ":" + readyStringArray[1] + ":" + readyStringArray[2];
    }

    static String[] prepareAndSplitTime(String s) {

        //Prepare string, by inserting the : before the letters, so we can split it after.
        StringBuilder readyString = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == 'P' || s.charAt(i + 1) == 'A') {
                readyString.append(s.charAt(i)).append(":");
            } else readyString.append(s.charAt(i));
        }
        // Split string in hours min,sec and format
        return readyString.toString().split(":");
    }
}
