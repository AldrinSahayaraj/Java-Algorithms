package org.java.settergetter;

public class Bank {
    private float interest = 4.3F;

    private String name = "ICICI";

    public String getName(){
        return this.name;
    }
    public float getInterest(){
        return this.interest;
    }

//    @Override
//    public int compare(Bank o1, Bank o2) {
//        String s1 = o1.getName();
//        return s1.compareTo();
//    }
}
