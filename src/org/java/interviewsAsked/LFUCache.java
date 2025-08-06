package org.java.interviewsAsked;

import java.util.LinkedHashMap;
import java.util.Map;

class LFUCache {
    int cap;
    Map<Integer,Node> map = new LinkedHashMap<Integer,Node>();

    class Node{
        int value;
        int count;
        Node(int value, int count){
            this.value = value;
            this.count = count;
        }
    }

    public LFUCache(int capacity) {
        cap=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node ex = map.get(key);
            ex.count+=1;
            map.remove(key);
            map.put(key,ex);
            return ex.value;
        }
        return -1;

    }

    public void put(int key, int value) {
        Node newN = new Node(value,1);
        if(cap>0){
            cap--;
            map.put(key,newN);
        } else {
            Integer min = null;
            boolean found = false;

            for(Map.Entry<Integer,Node> ent:map.entrySet()){
                Node ex = ent.getValue();
                if(min==null || ex.count < min){
                    min = ex.count;
                }
            }

            for(Map.Entry<Integer,Node> ent:map.entrySet()){
                Node ex = ent.getValue();
                if(ex.count == min){
                    map.remove(ent.getKey());
                    break;
                }
            }

            map.put(key,newN);
        }
    }

    public static void main(String[] args) {
        // [null,null,null,1,null,-1,3,null,-1,3,4] // null for insert ignore that in output
        // Leetcode link https://leetcode.com/problems/lru-cache/
        LFUCache lfu = new LFUCache(2);
        lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
        System.out.println("null");
        lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
        System.out.println("null");
        System.out.println(lfu.get(1));      // return 1
        // cache=[1,2], cnt(2)=1, cnt(1)=2
        lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
        System.out.println("null");
        // cache=[3,1], cnt(3)=1, cnt(1)=2
        System.out.println(lfu.get(2));      // return -1 (not found)
        System.out.println(lfu.get(3));      // return 3
        // cache=[3,1], cnt(3)=2, cnt(1)=2
        lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
        System.out.println("null");
        // cache=[4,3], cnt(4)=1, cnt(3)=2
        System.out.println(lfu.get(1));      // return -1 (not found)
        System.out.println(lfu.get(3));      // return 3
        // cache=[3,4], cnt(4)=1, cnt(3)=3
        System.out.println(lfu.get(4));      // return 4
        // cache=[4,3], cnt(4)=2, cnt(3)=3    // return 4

    }
}