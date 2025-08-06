package org.java;

public class QueueArrayFront<T> {
    final int MAX_SIZE = 5;
    T arr[];
    int front, rear;

    QueueArrayFront(){
        arr = (T[]) new Object[MAX_SIZE];
        front = -1;
        rear = -1;
    }
    void enqueue(T val){
        if(rear == MAX_SIZE-1)
            throw new IndexOutOfBoundsException("Queue overflow");
        if(front==-1)
            front++;
        arr[++rear] = val;
        System.out.println("Enqueue: Front:" + front + " rear :" +rear);
    }

    T dequeue(){
        if(front==-1 || front>rear)
            throw new IndexOutOfBoundsException("Queue is empty");
        System.out.println("Dequeue: Front:" + front + " rear :" +rear);
        return arr[front++];
    }

    boolean isEmpty(){
        return front == -1 || front>rear;
    }
}
