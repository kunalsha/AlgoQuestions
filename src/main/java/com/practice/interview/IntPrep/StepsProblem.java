package com.practice.interview.IntPrep;

import java.util.ArrayList;
import java.util.Arrays;

public class StepsProblem {
    public static int totalCombinationCountRecursive(int[] pointSet, int number) {
        int sum = 0;
        for (int i = 0; i < pointSet.length; i++) {
            if (number > pointSet[i]) {
                sum += totalCombinationCountRecursive(pointSet, number - pointSet[i]);
            } else if (number == pointSet[i]) {
                sum += 1;
            }
        }
        return sum;
    }

 
    public static void printCombinationCount(int[] pointSet, int number, ArrayList<Integer> inputArray) {
        System.out.println("Print " + Arrays.toString(pointSet) + " || " + number + " || " + inputArray.toString());
        for (int i = 0; i < pointSet.length; i++) {
            if (number > pointSet[i]) {
                ArrayList<Integer> newInputArr = new ArrayList<>(inputArray);
                newInputArr.add(pointSet[i]);
                printCombinationCount(pointSet, number - pointSet[i], newInputArr);
            } else if (number == pointSet[i]) {
                for (Integer integer : inputArray) {
                    System.out.print(integer + " ");
                }
               System.out.println(pointSet[i]);
               // System.out.println();
            }
        }
    }
 
    public static void main(String[] args) {
        int[] pointSet = { 1, 2, 3 };
        int number = 5;
        
        /*
         * For input 5
         * Total combination count is : 13
         * Combinations are as below:
         * 1 1 1 1 1
         * 1 1 1 2
         * 1 1 2 1
         * 1 1 3
         * 1 2 1 1
         * 1 2 2
         * 1 3 1
         * 2 1 1 1
         * 2 1 2
         * 2 2 1
         * 2 3
         * 3 1 1
         * 3 2
         */
 
        long startTime = System.nanoTime();
        System.out.println("Recursive Total combination count : " + totalCombinationCountRecursive(pointSet, number));
        long endTime = System.nanoTime();
        System.out.println("Recursive time : " + (endTime - startTime));
 
 
        System.out.println("Total possible combinations are as below:");
        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        printCombinationCount(pointSet, number, inputArray);
    }
 
}
