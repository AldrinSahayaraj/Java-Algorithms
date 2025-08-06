package org.java.abstraction;

public abstract class Bike {
    int minimumPrice = 100000;
    int discount;

    // abstract int percentageDiscount = 15; can't declare abstract keyword for variables

    abstract void run();

    void changeGear(){
        System.out.println("Gear Changed");
    }

    Bike(){
        System.out.println("Bike is created");
    }

    public static void main(String[] args){

        // can't create instance without overriding the abstract methods
        Bike bike = new Bike() {
            @Override
            void run() {
                System.out.println("Run method called");
            }
        };
       System.out.println("Minimum price : "+bike.minimumPrice);
    }
}
