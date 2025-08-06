package org.java;

public class StackArray<T> {
    static final int MAX_CAPACITY = 5;
    int top;
    T arr[] = (T[]) new Object[MAX_CAPACITY];

    StackArray(){
        top = -1;
    }
     void push(T val){
        if(top == MAX_CAPACITY-1)
            throw new IndexOutOfBoundsException("Stack overflow");
        arr[++top] = val;
    }

    T pop(){
        if(top == -1)
            throw new IndexOutOfBoundsException("Stack Underflow");
        return arr[top--];
    }

    T peak(){
        return arr[top];
    }

    boolean isEmpty(){
        return top == -1;
    }
}

class TestStackArray{
    public static void main(String args[]){
        StackArray<Integer> arr = new StackArray<Integer>();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        System.out.println(arr.pop());
        System.out.println(arr.peak());
        System.out.println(arr.pop());
        System.out.println(arr.isEmpty());
        System.out.println(arr.pop());
        System.out.println(arr.isEmpty());
    }
}
