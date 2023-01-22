package com.hackerRank;

import java.text.SimpleDateFormat;

public class HoursTimeConversionDateFormat {
    public static void main(String[] args) {
        System.out.println(timeConversion("02:05:56PM"));
        System.out.println(timeConversion("06:40:03AM"));
        System.out.println(timeConversion("04:45:54PM"));
    }

    public static String timeConversion(String s) {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");

        try {
            java.util.Date date = parseFormat.parse(s);
            return displayFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
