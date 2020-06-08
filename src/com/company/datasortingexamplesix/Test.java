package com.company.datasortingexamplesix;

import java.util.Collections;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<Product> linkedList = new LinkedList<>();
        linkedList.add(new Product(321,"Rice", 40.45));
        linkedList.add(new Product(991,"Wheat", 33.50));
        linkedList.add(new Product(820,"Cologate", 52));
        linkedList.add(new Product(2001,"Tooth brush", 35));
        linkedList.add(new Product(622,"Sugar", 32));
        linkedList.add(new Product(552,"Milk", 48));

        Collections.sort(linkedList,new ProIdComp().reversed());
        for (Product p : linkedList
             ) {
            System.out.println(p.p_id + " " + p.p_name + " " + p.p_cost);
        }

    }

}
