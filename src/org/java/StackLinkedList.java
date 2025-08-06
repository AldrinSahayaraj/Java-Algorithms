package org.java;

public class StackLinkedList<T> {
    class Node{
        T data;
        Node next;

        Node(T val){
            data = val;
            next = null;
        }
    }
    Node top;
    StackLinkedList(){
        top = null;
    }

    void push(T val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    T pop(){
        if(top == null){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        Node temp = top;
        top = top.next;
        return temp.data;
    }

    T peak(){
        if(top == null){
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return top.data;
    }

    boolean isEmpty(){
        return top==null;
    }
}

class TestStackLinkedList{
    public static void main(String args[]){
        StackLinkedList<Integer> list = new StackLinkedList<Integer>();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list.pop());
        System.out.println(list.peak());
        System.out.println(list.pop());
        System.out.println(list.isEmpty());
        System.out.println(list.pop());
        System.out.println(list.isEmpty());
        System.out.println(list.pop());
        System.out.println(list.peak());
    }
}
