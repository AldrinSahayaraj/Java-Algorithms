package org.java;

public class DoublyLinkedList<T> {
    Node head;
    Node tail;

    class Node{
        Node prev;
        T data;
        Node next;

        Node(T val){
            prev = null;
            data = val;
            next  = null;
        }
    }

    DoublyLinkedList(){
        head=null;
        tail=null;
    }

    public void insertAtBeginning(T val){
        Node newNode = new Node(val);
        newNode.next = head;
        if(head==null){
            tail=newNode;
        } else {
            head.prev = newNode;
        }
        head=newNode;
    }

    public void display(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
        System.out.println(" ");
    }

    public void displayRev(){
        Node n = tail;
        while(n!=null){
            System.out.print(n.data +" ");
            n = n.prev;
        }
        System.out.println(" ");
    }

    public void insertAtPos(int pos, T val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node current = head;

        for(int i=1; i<pos; i++){
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        if(current == tail)
            tail = newNode;
        else
            current.next.prev = newNode;
        current.next = newNode;
    }

    public void deleteAtPos(int pos){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(pos ==0) {
            head = head.next;
            if(head==null){
                tail = null;
                System.out.println("List is empty");
            } else
                head.prev = null;

            return;
        }

        Node current = head;
        Node prev = null;
        for(int i=1; i<=pos; i++){
            prev = current;
            current = current.next;
            if(current == null)
                throw new IndexOutOfBoundsException("Invalid Pos");
        }
        prev.next = current.next;
        if(current == tail)
            tail = prev;
        else
            current.next.prev = prev;

    }
}

class DoublyLinkedListTest{
    public static void main(String args[]){
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
        list.insertAtBeginning(4);
//        list.insertAtBeginning(2);
//        list.insertAtBeginning(1);
//        list.display();
//        list.displayRev();
//        System.out.println("---------------------");
//        list.insertAtPos(2,3);
//        list.display();
//        list.insertAtPos(4,5);
//        list.display();
//        list.displayRev();

        System.out.println("---------------------");
        list.deleteAtPos(0);
        list.display();
        list.displayRev();
        list.deleteAtPos(0);


    }
}
