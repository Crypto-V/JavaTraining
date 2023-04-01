package com.hackerRank2;

import java.util.Scanner;

public class Mocka {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int counter = 0;
            int result = a;
            while (counter < n){

                result += Math.pow(2,counter)*b;
                System.out.print(result+" ");
                counter++;

            }
        }
        in.close();
    }
}
