package org.java.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String args[]){
        // Fibonacci series  0 1 1 2 3 5 8
//        printfibo(7);

//        printNumber(4);
//        System.out.println();

//        System.out.println(findFactorial(4));
//        reverseString("TAMIL NADU");

//        int[] arr = {1,2,3,4,5,6};
//        System.out.println(isSortedArray(arr, arr.length));

        // Power of n
        // anything power 0 is 1, anything power 1 same.
        // 2 pow 4 = 2 * 2 * 2 * 2 = 16
//        System.out.println(findPower(5,5));


        // GCD - greatest common divisor
//        int no1 = sc.nextInt();
//        int no2 = sc.nextInt();
//        int small = no1 < no2 ? no1 : no2;
//        System.out.println(findGCD(no1, no2, small));
    }

    private static int findGCD(int no1, int no2, int small){
        if(small > 1){
            if(no1%small==0 && no2%small==0){
                return small;
            }
            return findGCD(no1, no2, --small);
        }
        return -1;
    }

    private static int findPower(int x, int n){
        if(n==1)
            return x;
        return x * findPower(x, n-1);
    }

    private static int isSortedArray(int[] arr, int length){
        if(length<=1) return 1;
        else
            return (arr[length-1] < arr[length-2]) ? 0 : isSortedArray(arr, length-1);
    }

    public static String reverseString(String input){
        if (input.isEmpty()) {return null;}
        else{
            int length = input.length();
            System.out.print(input.charAt(length - 1));
            return reverseString(input.substring(0, length - 1));
        }
    }
    public static int printNumber(int number){
        if(number ==0) return 0;
        else
            System.out.print(number);
        return printNumber(--number);
    }

    public static int findFactorial(int number){
        if (number == 1) return number;
        else
            return number * findFactorial(number-1);
    }

    public static void printfibo(int limit){
        int i=0;
        int j=1;
        System.out.println(i);
        System.out.println(j);

        printRemFibo(i,j, limit-2);

//       for(int count=3; count<=limit; count++){
//           int k = i+j;
//           System.out.println(k);
//           i=j;
//           j=k;
//       }
    }

    private static  int printRemFibo(int i, int j, int limit){
        if(limit==0) return 0;
        else
            System.out.println(i+j);
        return printRemFibo(j, i+j, --limit);
    }
}
