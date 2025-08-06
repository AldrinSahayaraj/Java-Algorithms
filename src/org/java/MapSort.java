package org.java;

import java.math.BigDecimal;
import java.util.*;
import java.util.LinkedList;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MapSort {
    public static void main(String args[]){
        Map<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("Z", "z");
        unsortMap.put("B", "b");
        unsortMap.put("A", "a");
        unsortMap.put("C", "c");
        unsortMap.put("D", "d");
        unsortMap.put("E", "e");
        unsortMap.put("Y", "y");
        unsortMap.put("N", "n");
        unsortMap.put("J", "j");
        unsortMap.put("M", "m");
        unsortMap.put("F", "f");
        // Iterate by for each java 8
        unsortMap.forEach((k,v) -> System.out.println("key : " + k +" value: "+ v));

        System.out.println("-------------");
        // Iterate by streams API
//        unsortMap.entrySet().stream().forEach(e -> System.out.println("key : " + e.getKey() +" value: "+ e.getValue()));

//        // sort by TreeMap
//        System.out.println("------After converted to TreeMap it automatically sorts by key-------");
//        TreeMap<String, String> tmap = new TreeMap<String,String>(unsortMap);
//        tmap.entrySet().stream().forEach(e-> System.out.println("key : " + e.getKey() +" value: "+ e.getValue()));
//
//        // sort by key desc
//        System.out.println("------ sort by key desc using treemap-------");
//        TreeMap<String,String> tumap = new TreeMap<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        tumap.putAll(unsortMap);
//        tumap.entrySet().stream().forEach(e-> System.out.println("key : " + e.getKey() +" value: "+ e.getValue()));



        // sort by value
//        System.out.println("------ sort by value by converting to list-------");
//        List<Map.Entry<String,String>> list = new
//                LinkedList<Map.Entry<String,String>>(unsortMap.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
//            @Override
//            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//
//        LinkedHashMap<String,String> sortedMap = new LinkedHashMap<String,String>();
//        for(Map.Entry<String,String> entry: list){
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//        sortedMap.entrySet().stream().forEach(e -> System.out.println("key : " + e.getKey() +" value: "+ e.getValue()));

        //convert map key to list
//        List<String> keyList = new ArrayList<>(sortedMap.keySet());
//        //convert map key to list using streams
//        List<String> keyLists = sortedMap.keySet().stream().collect(Collectors.toList());
//        //convert map values to list
//        List<String> valueList = new ArrayList<>(sortedMap.values());
//        //convert map value to list using streams
//        List<String> valueLists = sortedMap.values().stream().collect(Collectors.toList());
//        //convert map key to list using entry set
//        List<String> keyListes = sortedMap.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());


        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);


    }
}
