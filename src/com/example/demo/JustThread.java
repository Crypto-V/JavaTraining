package com.example.demo;

import java.util.Random;

public class JustThread {
    public static void main(String[] args) throws InterruptedException {
        int[] sharedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MyThread thread2 = new MyThread(sharedArray);
        LoadingThread thread3 = new LoadingThread(sharedArray);

        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t2.start();
        t3.start();

        t2.join();
        t3.join();
    }
}

class MyThread implements Runnable {
    private int[] sharedArray;
    private int baseCase = 0;

    public MyThread(int[] sharedArray) {
        this.sharedArray = sharedArray;
    }

    public void run() {
        while (baseCase <= 25) {
            for (int i = 0; i < sharedArray.length; i++) {
                sharedArray[i] = 0;
                System.out.println("Thread " + Thread.currentThread().getName() + " remove the variable: "
                        + sharedArray[i] + " at index: " + i);
            }
            baseCase++;
        }
    }
    public int getBaseCase() {
        return baseCase;
    }
}


class LoadingThread implements Runnable {
    private int[] sharedArray;

    public LoadingThread(int[] sharedArray) {
        this.sharedArray = sharedArray;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < sharedArray.length; i++) {
                sharedArray[i] = new Random().nextInt(100);
                System.out.println("Thread " + Thread.currentThread().getName() +
                        " added number: " + sharedArray[i] + " at index: " + i);
            }
        }
    }
}




