package org.scala;

import java.util.ArrayList;
import java.util.Arrays;

public class InteropTest {
    public void show(){
       // ArrayList<String> test = new ArrayList<String>(Arrays.asList("Aldrin", "Ragavi", "Rian"));

        //test.forEach(System.out::println);
        //test.forEach(a -> System.out.println(a));
        //for(String s: test){ System.out.println(s);}
        System.out.println("Interoperability - Both java and scala can be integrated");
        int i = 3;

        switch(i){
            case 1:
                System.out.println("One"); break;
            case 2:
                System.out.println("Two"); break;
            case 3:
                System.out.println("Three"); break;
            default:
                System.out.println("Default"); break;
        }

    }
}
