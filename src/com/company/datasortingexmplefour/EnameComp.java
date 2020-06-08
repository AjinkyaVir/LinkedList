package com.company.datasortingexmplefour;

import java.util.Comparator;

public class EnameComp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.emp_name.compareTo(o2.emp_name);
    }
}
