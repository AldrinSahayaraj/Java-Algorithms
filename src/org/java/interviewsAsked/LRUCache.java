package org.java.interviewsAsked;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {
    Map<Integer,Integer> m;
    int c;
    public LRUCache(int capacity) {
        m=new LinkedHashMap();
        c=capacity;
    }

    public int get(int key) {
        if(m.containsKey(key)){
            int v=m.get(key);
            m.remove(key);
            m.put(key,v);
            return v;
        }
        else return -1;
    }

    public void put(int key, int value) {
        if(m.containsKey(key)){
            m.remove(key);
            m.put(key,value);
            return;
        }
        if(c>0){
            c--;
            m.put(key,value);
        } else{
            List<Integer> l=new ArrayList(m.keySet());
            m.remove(l.get(0));
            m.put(key,value);
        }
    }

    public static void main(String[] args) {
        // [null,null,null,1,null,-1,null,-1,3,4] // null for insert ignore that in output
        // Leetcode link https://leetcode.com/problems/lru-cache/
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4

    }
}
