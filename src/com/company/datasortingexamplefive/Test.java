package com.company.datasortingexamplefive;

import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Product> linkedList = new LinkedList<>();
        linkedList.add(new Product(101, "Shampoo", 80));
        linkedList.add(new Product(221, "Hair Oil", 65));
        linkedList.add(new Product(91, "Powder", 40));
        linkedList.add(new Product(41, "Face cream", 154.65));

        Collections.sort(linkedList);
        for (Product p : linkedList
             ) {
            System.out.println(p.p_id + " " + p.p_name + " " + p.p_cost);
        }

    }
}
