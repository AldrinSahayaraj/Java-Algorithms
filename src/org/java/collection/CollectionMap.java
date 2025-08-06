package org.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Father");
        map.put(2,"Mother");

        Iterator iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
    }
}
