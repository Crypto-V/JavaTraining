package com.coderbyte;

import java.util.Scanner;

public class NextLargestNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(MathChallenge(num));
    }

    private static int MathChallenge(int num) {
        String strNum = Integer.toString(num);

        for (int i = strNum.length() - 2; i >= 0; i--) {
            //Check if the last 2 digits are greater one than the other
            if (strNum.charAt(i) < strNum.charAt(i + 1)) {
                String toCompare = String.valueOf(swap(strNum, i, i+1)+strNum.substring(i+2));

                //Check if this integer is greater that initial if yes return else decrease index by one.
                if (Integer.parseInt(toCompare) > num) return Integer.parseInt(toCompare);
                else {
                    i -= 1;
                }
            }
        }
        return num;
    }

    public static StringBuilder swap(String s, int index1, int index2) {
        String temp = String.valueOf(s.charAt(index1));
        StringBuilder str = new StringBuilder();
        str.append(s, 0, index1);
        str.append(s.charAt(index2));
        str.append(temp);
        return str;


    }

}