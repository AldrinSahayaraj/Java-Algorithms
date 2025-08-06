package org.java.abstraction;

public class Honda extends Bike{

    @Override
    void run() {
        System.out.println("Bike Started");
    }

    public static void main(String[] args){
        Honda honda = new Honda();
        honda.discount=10;
        honda.run();
        honda.changeGear();
        System.out.println("Minimum price from implementation class :" + honda.minimumPrice);
        System.out.println("Discount percentage from implementation class :" + honda.discount);
    }
}
