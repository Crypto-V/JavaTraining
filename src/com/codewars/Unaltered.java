package com.codewars;

import java.util.Scanner;

public class Unaltered {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.nextLine();
        double y = input.nextDouble();
        input.nextLine();
        String z = input.nextLine();


        System.out.println("String: " + z + "\nDouble: " + y + "\nInt: " + x);
    }


}
