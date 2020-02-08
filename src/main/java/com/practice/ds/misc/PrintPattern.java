package com.practice.ds.misc;

import java.util.Random;

//You a given a number N. You need to print the pattern for the given value of N.
//        for N=2 the pattern will be
//        2 2 1 1
//        2 1
//        for N=3 the pattern will be
//        3 3 3 2 2 2 1 1 1
//        3 3 2 2 1 1
//        3 2 1
public class PrintPattern {

    public static void main(String[] args) {
        PrintPattern demo = new PrintPattern();
        demo.print(new Random().nextInt(10));
    }

    private void print(int nextInt) {
        System.out.println(nextInt);
        int times = nextInt;

        for (int k = 0; k < nextInt; k++) {
            for (int i = nextInt; i > 0 ; i--) {
                for (int j = times; j > 0 ; j--) {
                    System.out.print(i);
                }
            }
            times--;
            System.out.println();
        }
    }
}
