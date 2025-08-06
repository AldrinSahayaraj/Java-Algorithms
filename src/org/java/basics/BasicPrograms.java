package org.java.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BasicPrograms {
    public static void main(String[] args) {
        // Two strings are said to be anagram if they contain same set of characters but in different order
        // System.out.println(findAnagram("Mother In Law","Hitler Woman"));
        //  Armstrong number if it is equal to sum of its digits each raised to the power of number of digits in it
        //  153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//        System.out.println(findArmstrong(153));
//        int[] arr = {45, 49, 28, 75, 51, 42};
//        System.out.println(findSecondLargest(arr));
//        Count occurance of each character in a string
//        countCharacter("Java J2EE");
//        int[] arr = {15, 51, 7, 81, 5, 11, 25};
//        System.out.println(Arrays.toString(continuosSubArray(arr, 41)));
//        int[] arr = {14, 0, 5, 2, 0, 3, 0}; // to  {14, 5, 2, 3, 0, 0, 0}
//        System.out.println(Arrays.toString(separateZeros(arr)));
//        reverseArray(new int[] {4, 5, 8, 9, 10});
        System.out.println(repeatedSubStringPattern("abcabcabcabc"));
    }

    private static boolean repeatedSubStringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    repeated.append(substring);
                }
                if (repeated.toString().equals(s)) return true;
            }
        }
        return false;
    }

    private static void reverseArray(int[] inputArray) {
        int temp;
        for (int i = 0; i < inputArray.length/2; i++)
        {
            temp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length-1-i];
            inputArray[inputArray.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(inputArray));
    }

    private static int[] separateZeros(int[] inputArray) {
        int counter = 0;
        for (int i = 0; i < inputArray.length; i++)
        {
            if(inputArray[i] != 0)
            {
                inputArray[counter] = inputArray[i];
                counter++;
            }
        }
        while (counter < inputArray.length)
        {
            inputArray[counter] = 0;
            counter++;
        }
        System.out.println(Arrays.toString(inputArray));
        return inputArray;
    }
// {23, 2, 4, 6, 7} - 6
    private static int[] continuosSubArray(int[] arr, int num) {
        for(int i=0; i+2<arr.length; i++){
            if(arr[i]+arr[i+1]+arr[i+2]==num){
                return new int[] {arr[i],arr[i+1],arr[i+2]};
            }
        }
        return new int[]{0};
    }

    public static boolean findAnagram(String st1, String st2){
        String s1 = st1.replaceAll("\\s","");
        String s2 = st2.replaceAll("\\s","");
        if(s1.length()!=s2.length())
            return false;

        char[] sarr1 = s1.toLowerCase().toCharArray();
        char[] sarr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(sarr1);
        Arrays.sort(sarr2);
        // If you are comparing multi dimensional array use Arrays.deepEquals() method
        return Arrays.equals(sarr1, sarr2);
    }

    public static boolean findArmstrong(int num){
        int copyNum = num;
        int sum = 0;
        int len = String.valueOf(num).length();
        while(copyNum>0) {
            int lastdigit = copyNum % 10;
            int powerd = 1;
            for (int i = 0; i < len; i++) {
                powerd = powerd * lastdigit;
            }
            sum = sum + powerd;
            copyNum = copyNum/10;
        }
        return sum==num;
    }

    public static int findSecondLargest(int[] arr){
        int firstLargest = 0;
        int secondLargest = 0;
        if(arr[0]>arr[1]){
            firstLargest = arr[0];
            secondLargest = arr[1];
        } else {
            firstLargest = arr[1];
            secondLargest = arr[0];
        }

        for(int i=2; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] < firstLargest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void countCharacter(String s){
        char[] strChar = s.replaceAll("\\s","").toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i=0; i<strChar.length; i++){
            char c = strChar[i];
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        System.out.println(map.entrySet());
    }
}
