package org.java.palindromes;

import java.util.HashMap;

public class LongestPalindrome {

    public static void main(String[] args) {
        // Find characters which is in multiples of 2 and 1 char with odd count to form palindrome
        // "abccccdd", One longest palindrome that can be built is "dccaccd", whose length is 7.
//        System.out.println(longestPalindrome("abccccdd"));
        // "babad", "bab" or "aba" is valid // sliding window pattern
        System.out.println(longestPalindromicSubString("cbabab"));

    }

    private static String longestPalindromicSubString(String s) {
        int n = s.length();
        int start=0, end=1;
        int low, hi;

        for(int i=0; i<n;i++){
            low = i-1;
            hi = i;
            while(low>=0 && hi<n && s.charAt(low)==s.charAt(hi)){
                if(hi-low+1>end){
                    start = low;
                    end = hi-low+1;
                }
                low--;
                hi++;
            }
            low = i-1;
            hi = i+1;
            while(low>=0 && hi<n && s.charAt(low)==s.charAt(hi)){
                if(hi-low+1>end){
                    start = low;
                    end = hi-low+1;
                }
                low--;
                hi++;
            }
        }
        System.out.println(start +" "+ end);

        return s.substring(start, start+end);
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int palindromeSize = 0;
        for(int i =0 ; i<s.length();i++){
            int keyCount = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),++keyCount);
            if (keyCount%2 == 0) palindromeSize +=2;
        }
        for (int size : map.values()){
            if (size%2==1){
                palindromeSize++;
                break;
            }
        }
        return palindromeSize;
    }
}
