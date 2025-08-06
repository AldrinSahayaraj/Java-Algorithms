package org.java.abstraction;

public class Employee implements IndianEmployer, Family{
    @Override
    public void work40Hours() {
        System.out.println("Working for 40 hours");
    }

    @Override
    public void takeLeave() {
        // empty override
    }

    @Override
    public void play() {
        System.out.println("Playing Game");
    }

    @Override
    public void workExtraHour() {
        System.out.println("Working additional 2 hours");
    }

    @Override
    public String toString(){
        return "Employee class object";
    }

    public static void main(String[] args){
        Employee employee = new Employee();
        employee.work40Hours();
        employee.takeLeave();
        employee.play();
        employee.workExtraHour();
        System.out.println("Basic Salary : "+employee.basicSalary);
        // employee.basicSalary = 40000; can't edit because static, final by default

        IndianEmployer indianEmployer = new Employee(); // Dynamic Binding using interface name
        indianEmployer.work40Hours();

        Family family = new Employee();
        family.play();
//        family.work40Hours(); Interface can use implementing class memory to call it's own methods but can't call other interface methods
        System.out.println(employee);
    }
}
