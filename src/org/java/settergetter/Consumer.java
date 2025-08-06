package org.java.settergetter;

import org.java.settergetter.Bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consumer extends Bank {
    public static void main(String args[]){

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("b");
        list.add("c");

        String[] sarr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(sarr));

        ArrayList<String> arli = new ArrayList<>(Arrays.asList(sarr));
        for(String s : arli){
            System.out.println(s);
        }
        Consumer consumer = new Consumer();
        System.out.println(consumer.getInterest());
        System.out.println(consumer.getName());
    }
}
