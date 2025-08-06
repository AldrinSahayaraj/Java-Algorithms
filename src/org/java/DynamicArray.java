package org.java;

import java.util.Scanner;
import java.util.Arrays;

public class DynamicArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DynamicArrayTest<Integer> tst = new DynamicArrayTest<Integer>();
        while(true) {
            System.out.println("Press 1 to display array");
            System.out.println("Press 2 to add value in array");
            System.out.println("Press 3 to insert value with position in array");
            System.out.println("Press 4 to delete value with position in array");
            int input = sc.nextInt();
            switch(input) {
                case 1:
                    tst.display();
                    break;
                case 2:
                    System.out.println("Enter value");
                    int num = sc.nextInt();
                    tst.add(num);
                    break;
                case 3:
                    System.out.println("Enter value to insert");
                    int arrval = sc.nextInt();
                    System.out.println("Enter position");
                    int posi = sc.nextInt();
                    tst.insert(arrval, posi);
                    break;
                case 4:
                    System.out.println("Enter position");
                    int pos = sc.nextInt();
                    tst.deleteAtPos(pos);
                    break;
            }
        }
    }
}

 class DynamicArrayTest<T> {
    private static final int InitialCapacity = 4;
    private T arr[];
    private int size;
    private int capacity;

    DynamicArrayTest() {
        size =0;
        arr = (T[]) new Object[InitialCapacity];
        capacity = InitialCapacity;
    }

    public void deleteAtPos(int pos){
        for(int i=pos+1; i<=size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }
    public void display(){
        System.out.println("Values in Array");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public void add(T val){
        System.out.println("value to be added :" + val);
        if(size==capacity) {
            System.out.println("Array size exceeded");
            expandArray();
        }
        arr[size++] = val;
    }

    private void expandArray(){
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    public void insert(T val, int pos){
        if(size==capacity) {
            System.out.println("Array size exceeded");
            expandArray();
        }
        System.out.println("Value to be inserted : " + val + " Position: " + pos + "Shift values to right");
        for(int i=size-1; i>=pos; i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = val;
        size++;

    }
}
