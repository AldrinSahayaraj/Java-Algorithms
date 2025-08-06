package org.java;

public class Student {
    String name;
    int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

   public String getName(){
        return this.name;
   }

   public int getAge(){
        return this.age;
   }

   @Override
    public String toString(){
        return this.name+"  "+this.age;
   }
}
