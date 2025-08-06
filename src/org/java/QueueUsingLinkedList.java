package org.java;

public class QueueUsingLinkedList<T> {
    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    }
    Node front, rear;
    QueueUsingLinkedList(){
        front = null;
        rear = null;
    }

    void enqueue(T val){
        Node newNode = new Node(val);
        if(front==null)
            front = newNode;
        else
            rear.next = newNode;
        rear = newNode;
    }

    T dequeue(){
        if(front==null)
            throw new IndexOutOfBoundsException("Queue is empty");
        T temp = front.data;
        front = front.next;
        if(front==null)
            rear = null;
        return temp;
    }

    boolean isEmpty(){
        return front==null;
    }

    T getElementAtFirst(){
        if(front==null)
            throw new IndexOutOfBoundsException("Queue is empty");
        return front.data;
    }
}
