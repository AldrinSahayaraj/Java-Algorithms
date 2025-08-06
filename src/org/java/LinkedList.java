package org.java;

import java.util.Iterator;
import java.util.Scanner;
public class LinkedList<T> implements Iterable<T>{
    Node head;
    class Node{
        T data;
        Node next;
    }

    LinkedList(){
        head = null;
    }

    public void insertAtFirst(T val){
        Node n = new Node();
        n.data = val;
        if(head == null){
            head = n;
        } else {
            Node temp = head;
            head = n;
            n.next = temp;
        }
    }

    public void insertAtPosition(int pos, T val){
        Node n = new Node();
        n.data = val;

        if(head == null){
            head = n;
        } else {
            Node prevNode = head;
            for (int i = 0; i < pos; i++) {
                if(i == pos-1){
                    n.next = prevNode.next;
                    prevNode.next = n;
                }
                prevNode = prevNode.next;
            }
        }
    }

    public void deleteAtPos(int pos){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(pos==0){
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;
        for(int i =1; i<=pos; i++){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }

    public void display(){
        Node x = head;
            while (x != null) {
                System.out.print(x.data + ", ");
                x = x.next;
            }
        System.out.println("");
    }

    public void reverse(){
        Node prev = null;
        Node current= head;
        Node next = current.next;

        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node temp = head;

            public boolean hasNext() {
                return temp != null;
            }

            public T next() {
                T val = temp.data;
                temp = temp.next;
                return val;
            }
        };
    }
}

class LinkedListTest{
    public static void main(String args[]){
        System.out.println("Linked List");
        LinkedList<Integer> list = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Display");
            System.out.println("2. Insert at 1st position");
            System.out.println("3. Insert at specific position");
            System.out.println("4. Delete at specific position");
            System.out.println("5. Reverse list");

            int input = sc.nextInt();
            switch (input)  {
                case 1:
//                    list.display();
                    for(int i : list){
                        System.out.print(i+" ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Enter number to insert at 1st position");
                    int val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;
                case 3:
                    System.out.println("Enter position ");
                    int pos = sc.nextInt();
                    System.out.println("Enter value");
                    int in = sc.nextInt();
                    list.insertAtPosition(pos,in);
                    break;
                case 4:
                    System.out.println("Enter position");
                    int delpos = sc.nextInt();
                    list.deleteAtPos(delpos);
                    break;
                case 5:
                    list.reverse();
                    list.display();
                    break;
            }

        }
    }
}


