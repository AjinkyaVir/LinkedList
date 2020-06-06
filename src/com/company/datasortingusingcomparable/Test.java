package com.company.datasortingusingcomparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(111,"Aju"));
        employees.add(new Employee(225,"Sau"));
        employees.add(new Employee(554,"Raju"));
        employees.add(new Employee(444,"Abhi"));
        employees.add(new Employee(102,"Anu"));

        Collections.sort(employees);

        for (Employee e : employees
             ) {
            System.out.println(e.eid + " " + e.eName);
        }

    }


}
