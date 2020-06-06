package com.company.datasortingusingcomparable;

public class Employee implements Comparable<Employee> {

    // Data sorting using Comparable generic version

    int eid;
    String eName;

    public Employee(int eid, String eName) {
        this.eid = eid;
        this.eName = eName;
    }

    @Override
    public int compareTo(Employee o) {

        return eName.compareTo(o.eName);


    }
}
