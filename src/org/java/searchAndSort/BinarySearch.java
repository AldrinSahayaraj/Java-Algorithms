package org.java.searchAndSort;

import java.util.Arrays;

public class BinarySearch {
    public static int find(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        System.out.println(Arrays.toString(arr));
        System.out.println("Initial Start : " + start + " End : "+ end);
        boolean asc = false;
        if(arr[start]<arr[end])
            asc = true;

        while(start<=end) {
            System.out.println("Start : " + start + " End : "+ end);
            int mid = (start + end) / 2;
            System.out.println("Mid : "+ mid);
            if(asc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
