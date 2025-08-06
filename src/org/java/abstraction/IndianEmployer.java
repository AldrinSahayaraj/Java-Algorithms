package org.java.abstraction;

public interface IndianEmployer extends EmployerRules{ // SubInterface
    int basicSalary=10000; // can have same variable in subInterface and class extending sub interface get this variable value

    void workExtraHour();
}
