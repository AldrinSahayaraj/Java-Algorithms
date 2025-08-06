package org.java.searchAndSort;

import java.util.Arrays;

public class Sort {

    // 10,30,5,70,40 - Find smallest using min index and move to left
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j] && arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    // 10,30,5,70,40 - Move largest element to right side
    public static void bubbleSort(int[] arr){
        for(int i=1; i<arr.length; i++) {
            boolean swapped = false;
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length - i; j++) {
                System.out.println("Pass : " +i);
                if (arr[j] > arr[j + 1]) {
                    // swap
                    swapped= true;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            if(!swapped){
                System.out.println("Elements are already sorted");
                break;
            }
        }
    }

    // 10,30,5,70,40 - Move smallest element to left side
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println("Pass :" + i);
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    System.out.println("This Phase already sorted");
                    break;
                }
            }
        }
    }

    // 10,30,5,70,40 – split the array in equal half recursively till one element and sort and merge it
    public static int[] mergeSort(int[] arr){
        System.out.println(Arrays.toString(arr));
        if(arr.length == 1)
            return arr;

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right){
        int i=0, j=0, k=0;
        int[] result = new int[left.length + right.length];
        while(i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while(i < left.length)
            result[k++] = left[i++];
        while(j < right.length)
            result[k++] = right[j++];
        return result;
    }

    public static void mergeSortInPlace(int[] arr, int start, int end){
        if(end-start == 1)
            return;

        int mid = (start+end)/2;
        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    private static void mergeInPlace(int[] arr, int start, int mid, int end){
        int i=start, j=mid, k=0;
        int[] result = new int[end-start];
        while(i < mid && j < end) {
            if (arr[i] < arr[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = arr[j++];
            }
        }

        while(i < mid)
            result[k++] = arr[i++];
        while(j < end)
            result[k++] = arr[j++];

        for(int x=0; x<result.length; x++){
            arr[start+x] = result[x];
        }
    }

    // 10,30,5,70,40
    public static void quickSort(int[] arr, int low, int high){
        int s = low;
        int e = high;
        int mid = (s+e)/2;
        System.out.println(Arrays.toString(arr)+" low: "+low+" high: "+high+" start: "+s+" end: "+e+" mid: "+ mid);
        if(low >= high)
            return;
        int pivot = arr[mid];

        while(s<=e){
            while(arr[s]<pivot)
                s++;
            while(arr[e]>pivot)
                e--;

            if(s<=e){
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
