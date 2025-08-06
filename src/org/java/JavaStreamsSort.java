package org.java;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamsSort {

    public static void main(String arg[]){

        int[] arr = {2,-1,0,5,3};
        System.out.println("Sort Array using Streams");
        Arrays.asList(2,-1,0,5,3).stream().sorted().forEach(System.out::println);

        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Ald",20));
        list.add(new Student("Sen",21));
        list.add(new Student("Ram",22));

        list.stream().forEach(System.out::println);
        list = list.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
        System.out.println("After sorting by age");
        list.stream().forEach(System.out::println);
        list = list.stream().sorted(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return o1.getName().compareTo(o2.getName());
            }
        }).collect(Collectors.toList());
        System.out.println("After sorting by name");
        list.stream().forEach(System.out::println);
        list = list.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge() == o2.getAge()){
                    return o1.getName().compareTo(o2.getName());
                } else if(o1.getAge() > o2.getAge()){
                    return 1;
                } else {
                    return -1;
                }
            }
        }).collect(Collectors.toList());
        System.out.println("After sorting by age and name -- if age is same then compare name");
        list.stream().forEach(System.out::println);
        list = list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println("After sorting by name");
        list.stream().forEach(System.out::println);
        list = list.stream().filter(a -> a.getName().equals("Ald")).collect(Collectors.toList());
        list.stream().forEach(System.out::println);


    }
}
