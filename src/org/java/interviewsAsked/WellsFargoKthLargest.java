package org.java.interviewsAsked;

import java.util.PriorityQueue;

public class WellsFargoKthLargest {
        int k;
        PriorityQueue<Integer> pq;

        public WellsFargoKthLargest(int k, int[] nums) {
            this.k=k;
            pq=new PriorityQueue<>();
            for(int num:nums){
                add(num);
            }

        }

        public int add(int val) {
            pq.add(val);
            if(pq.size()>k){
                pq.remove();  // removes the smallest element
            }
            return pq.peek(); // returns the k-th largest element

        }

    public static void main(String[] args) {
        WellsFargoKthLargest obj = new WellsFargoKthLargest(3, new int[] {4, 5, 8, 2});
        System.out.println(obj.add(3)); // return 4
        System.out.println(obj.add(5)); // return 5
        System.out.println(obj.add(10));// return 5
        System.out.println(obj.add(9)); // return 8
        System.out.println(obj.add(4)); // return 8
    }

}
