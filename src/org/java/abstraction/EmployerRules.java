package org.java.abstraction;

public interface EmployerRules {
    int basicSalary = 20000;

//    EmployerRules(){ Constructor not allowed
//
//    }
//    void work40Hours(){  No instance method allowed
//
//    }

    void work40Hours();

    void takeLeave();

    public static void main(String[] args){
        // can't create instance without overriding the abstract methods
        EmployerRules rules = new EmployerRules() {
            @Override
            public void work40Hours() {

            }

            @Override
            public void takeLeave() {

            }
        };
        System.out.println("Basic salary:"+ rules.basicSalary);
        System.out.println("Basic salary:"+ EmployerRules.basicSalary); // fields are public, static, final by default
        // so, static fields are accessible in static method
    }
}
