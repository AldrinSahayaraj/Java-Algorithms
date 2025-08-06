package org.java;

public class QueueArrayShift<T> {
    final int MAX_SIZE = 5;
    T arr[];
    int rear;

    QueueArrayShift(){
        arr = (T[]) new Object[MAX_SIZE];
        rear = -1;
    }
    void enqueue(T val){
        if(rear == MAX_SIZE-1)
            throw new IndexOutOfBoundsException("Queue overflow");
        arr[++rear] = val; // O(1)
        System.out.println("Enqueue: rear :" +rear);
    }

    T dequeue(){
        if(rear==-1)
            throw new IndexOutOfBoundsException("Queue is empty");
        System.out.println("Dequeue: rear :" +rear);
        T temp = arr[0]; // O(n)
        for(int i=1; i<MAX_SIZE; i++)
            arr[i-1] = arr[i];
        rear--;
        return temp;
    }

    boolean isEmpty(){
        return rear == -1;
    }
}
