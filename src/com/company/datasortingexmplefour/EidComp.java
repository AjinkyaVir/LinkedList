package com.company.datasortingexmplefour;

import java.util.Comparator;

public class EidComp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        Employee employee = o1;
        Employee employee1 = o2;

        if (employee.emp_id == employee1.emp_id){
            return 0;
        }else if(employee.emp_id > employee1.emp_id){
            return 1;
        }else{
            return -1;
        }

    }
}
