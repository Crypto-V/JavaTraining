package com.hackerRank;

public class FibonnaciApp {
    public static void main(String[] args) {
        //Fibonnaci number is defined by the sum of two previous numbers.
        //fib(0)=0
        //fib(1)=1
        //fib(2)=fib(1)+fib(0)=1... and so on
        System.out.println(fib(30));
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return( ((fib(n-1))+(fib(n-2))) );
    }
}
