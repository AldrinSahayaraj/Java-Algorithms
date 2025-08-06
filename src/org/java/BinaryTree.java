package org.java;

public class BinaryTree {
     public class Node{
        int data;
        public Node left;
        public Node right;
        public Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }

    public Node root;
    public BinaryTree(int val){
        root = new Node(val);
    }

    public void insertLeft(Node root, int val){
        Node newNode = new Node(val);
        root.left = newNode;
    }

    public void insertRight(Node root, int val){
        Node newNode = new Node(val);
        root.right = newNode;
    }

    public static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+ ",");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+ ",");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+ ",");
        }
    }
}

