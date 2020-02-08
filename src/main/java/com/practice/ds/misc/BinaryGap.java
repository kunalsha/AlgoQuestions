package com.practice.ds.misc;

public class BinaryGap {
 public static void main(String[] args) {
     int num = 1041;
     
     String binaryNum = binaryNum(num);
     
     System.out.println("Binary presentation of " + num  + " is " + binaryNum );
     
     System.out.println(displayBinaryGap(binaryNum));
     
 }
 
 public static String binaryNum (int num) {
     StringBuilder sb = new StringBuilder();
     int numb = num;
     while(numb != 0) {
         int bin = numb % 2;
         sb = sb.append(bin);
         numb = numb / 2;
         System.out.println(numb);
     }
     
     return sb.toString();
 }
 
 public static int displayBinaryGap (String binNum) {
     int counter = 0;
     
     for(int i=0; i<binNum.length(); i++) {
         if(binNum.charAt(i) == '0')
             counter++;
     }
     return counter;
 }
}
