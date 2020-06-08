package com.company.datasortingexmplefour;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(new Employee(111,"Aju"));
        arrayList.add(new Employee(554,"Sau"));
        arrayList.add(new Employee(313,"Abhi"));
        arrayList.add(new Employee(622,"Shra"));

        System.out.println("Sorting by using Id :: \n");
        Collections.sort(arrayList, new EidComp());

        for (Employee e : arrayList
             ) {
            System.out.println(e.emp_id + " " + e.emp_name);
        }
        System.out.println("************************************");
        System.out.println("Sorting by using Name :: \n");

        Collections.sort(arrayList,new EnameComp());
        for (Employee e1: arrayList
             ) {
            System.out.println(e1.emp_id + " " + e1.emp_name);
        }

    }

}
