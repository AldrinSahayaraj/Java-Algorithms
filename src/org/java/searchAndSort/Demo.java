package org.java.searchAndSort;

import org.java.BinaryTree;

import java.util.Arrays;

public class Demo {
    public static void main(String args[]){
//  Linear Search
//            int[] arr = new int[]{1,2,3,4,5,6};
//            System.out.println(LinearSearch.find(arr, 4));
//            System.out.println(LinearSearch.find(arr, 7));
//            String s = "Rian Josh";
//            System.out.println(LinearSearch.find(s, 'J'));
//            System.out.println(LinearSearch.find(s, 'A'));
//            int[][] marr = new int[][]{
//                    {1,2,3,4,5},
//                    {6,7,8,9,10,11},
//                    {12,13,14,15,16,17}
//            };
//            System.out.println(Arrays.toString(LinearSearch.find(marr, 4)));
//            System.out.println(Arrays.toString(LinearSearch.find(marr, 17)));
//            System.out.println(Arrays.toString(LinearSearch.find(marr, 19)));

//            Binary Search
//            int[] arr = new int[]{1,3,5,9,13,15};
//            System.out.println("Result Index: "+BinarySearch.find(arr,15));
//            int[] arr1 = new int[]{15,13,9,5,3,1};
//            System.out.println("Result Index: "+BinarySearch.find(arr1,13));

//          Selection Sort
//            int[] arr = new int[]{10,30,5,70,40};
//            int[] arr = new int[]{5,8,4,3,7,6,2,9,5};
//            Sort.selectionSort(arr);
//            System.out.println(Arrays.toString(arr));

//        Bubble Sort
//            int[] arr = new int[]{10,30,5,70,40};
//            int[] arr = new int[]{5,8,4,3,7,6,2,9,5};
//            Sort.bubbleSort(arr);
//            System.out.println(Arrays.toString(arr));

//        Insertion Sort
//            int[] arr = new int[]{10,30,5,70,40};
//            int[] arr = new int[]{5,8,4,3,7,6,2,9,5};
//            Sort.insertionSort(arr);
//            System.out.println(Arrays.toString(arr));

//        Merge sort
//        int[] arr = new int[]{5,4,7,1};
//        int[] arr = new int[]{10,9,7,8,5,6,3,4,1,2};
//        System.out.println(Arrays.toString(Sort.mergeSort(arr)));
//        int[] arr1 = new int[]{10,9,7,8,5,6,3,4,1,2};
//        Sort.mergeSortInPlace(arr1, 0, arr1.length);
//        System.out.println(Arrays.toString(arr1));

//         Quick sort
//        int[] arr1 = new int[]{5,8,4,3,7,6,2,9,5};
//        int[] arr1 = new int[]{5,4,7,1};
//        System.out.println(Arrays.toString(arr1));
        int[] arr1 = new int[]{10,30,5,70,40};
        Sort.quickSort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));

        // Binary Tree
//        BinaryTree tree = new BinaryTree(10);
//        tree.insertLeft(tree.root, 5);
//        tree.insertRight(tree.root, 15);
//        tree.insertLeft(tree.root.left, 3);
//        tree.insertRight(tree.root.left, 8);
//        tree.insertLeft(tree.root.right, 12);
//
//        BinaryTree.preOrder(tree.root);
//        System.out.println();
//        BinaryTree.inOrder(tree.root);
//        System.out.println();
//        BinaryTree.postOrder(tree.root);

//        BinarySearchTree tree = new BinarySearchTree(50);
//        tree.insert(20);
//        tree.insert(60);
//        tree.insert(10);
//        tree.insert(30);
//        tree.insert(40);
//        tree.inOrder(tree.root);
//
//        if( tree.search(tree.root, 20) == null){
//            System.out.println("Not found");
//        } else {
//            System.out.println("Found value");
//        }
//
//        tree.delete(50);
//        tree.inOrder(tree.root);
//        System.out.println(" ");
//        tree.delete(70);
//        tree.inOrder(tree.root);
//        System.out.println(" ");


//        QueueArrayFront<Integer> que = new QueueArrayFront<Integer>();
//        QueueArrayShift<Integer> que = new QueueArrayShift<Integer>();
//        QueueUsingLinkedList<Integer> que = new QueueUsingLinkedList<Integer>();
//        System.out.println(que.dequeue());
//        que.enqueue(3);
//        que.enqueue(4);
//        que.enqueue(5);
//        que.enqueue(6);
//        System.out.println(que.dequeue());
//        System.out.println(que.dequeue());
//        System.out.println(que.isEmpty());
//        System.out.println(que.dequeue());
//        System.out.println(que.isEmpty());
//        System.out.println(que.dequeue());
//        System.out.println(que.getElementAtFirst());
    }
}
