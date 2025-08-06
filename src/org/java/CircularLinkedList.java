package org.java;

public class CircularLinkedList<T> {
    Node last;
    class Node{
        T data;
        Node next;
        Node(T val){
            data = val;
            next = null;
        }
    }
    CircularLinkedList(){
        last = null;
    }

    public void insertAtBeginning(T val){
        Node newNode = new Node(val);
        if(last==null){
            last = newNode;
            newNode.next = last;
        } else{
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtEnd(T val){
        Node newNode = new Node(val);
        if(last==null){
            last = newNode;
            newNode.next = last;
        } else{
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void display(){
        if(last==null){
            System.out.println("List is empty");
            return;
        }
        Node current = last.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while(current!=last.next);
        System.out.println(" ");
    }

    public void deleteAtBegining(){
        if(last==null){
            System.out.println("List is empty");
            return;
        }
        if(last.next==last){
            last = null;
        } else {
            last.next = last.next.next;
        }
    }
    public void deleteAtEnd(){
        if(last==null){
            System.out.println("List is empty");
            return;
        }
        if(last.next==last){
            last = null;
        } else {
            Node current = last.next;
            while(current.next != last){
                current = current.next;
            }
            current.next = last.next;
            last = current;
        }
    }
}

class CircularLinkedListTest{
    public static void main(String args[]){
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
        list.insertAtBeginning(2);
        list.display();
        list.insertAtBeginning(1);
        list.display();
        list.insertAtEnd(3);
        list.display();
        list.insertAtEnd(4);
        list.display();
        list.deleteAtBegining();
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteAtBegining();
        list.display();
        list.deleteAtBegining();
        list.display();
    }
}
