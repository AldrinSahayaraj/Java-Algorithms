package org.java.searchAndSort;

public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;

        int height;
        public Node(int val){
            key = val;
            left = right = null;
            height = 0;
        }
    }
    Node root;
    public BinarySearchTree(int val){
        root = new Node(val);
    }

    public void insert(int val){
        root = insert(root, val);
    }
    public Node insert(Node node, int val){
        if(node == null) {
            return new Node(val);
        }

        if(val < node.key)
            node.left = insert(node.left, val);
        else if(val > node.key)
            node.right = insert(node.right, val);
        else
            return node;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
//        if(val == 75)
//            System.out.println("Node height is node: " +node.key+ " val: "+ node.height);
        int bf = getBalanceFactor(node);

        // Case LL
        if(bf > 1 && val < node.left.key){
            return rotateRight(node);
        }
        // Case RR
        if(bf < -1 && val > node.right.key){
            return rotateLeft(node);
        }
        // Case LR
        if(bf > 1 && val > node.left.key){
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        // Case RL
        if(bf < -1 && val < node.right.key){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    private Node rotateLeft(Node z){
        Node y = z.right;
        Node t2 = y.left;

        y.left = z;
        z.right = t2;
        z.height = 1+ max(getHeight(z.left), getHeight(z.right));
        y.height = 1+max(getHeight(y.left), getHeight(y.right));
        return y;
    }

    private Node rotateRight(Node z){
        Node y = z.left;
        Node t3 = y.right;

        y.right = z;
        z.left = t3;

        z.height = 1+ max(getHeight(z.left), getHeight(z.right));
        y.height = 1+max(getHeight(y.left), getHeight(y.right));
        return y;
    }

    private int getBalanceFactor(Node node){
        if(node == null)
            return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    private int max(int left, int right){
        return left > right ? left: right;
    }
    private int getHeight(Node node){
        if(node==null)
            return -1;
        return node.height;
    }

    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println("val : "+ root.key + " height : " + root.height);
            inOrder(root.right);
        }
    }

    public Node search(Node root, int val){
        if(root == null || root.key == val)
            return root;

        if(val < root.key)
            return search(root.left, val);

        return search(root.right, val);
    }

    public void delete(int val){
        root = delete(root, val);
    }
    public Node delete(Node root, int val){
        if(root == null)
            return root;

        if(val < root.key)
            root.left = delete(root.left, val);
        else if(val > root.key)
            root.right = delete(root.right, val);
        else {
            if(root.right == null)
                return root.left;
            else if(root.left == null)
                return root.right;
            else {
                root.key = min(root.right);
            }
        }
        return root;
    }

    private int min(Node root){
        int minVal = root.key;
        while(root.left!=null) {
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }
}
