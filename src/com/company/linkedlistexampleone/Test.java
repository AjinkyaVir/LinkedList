package com.company.linkedlistexampleone;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        /*
        * Linked list introduce in version 1.2
        * Allow heterogeneous data
        * null value allowed
        * duplicate value allowed
        * insertion order preserved
        * non-synchronized
        * double linked list
        * support cursor - iterator, list iterator
        *
        *
        * */

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Aju"); // To add data into the linked list
        linkedList.add("Sau");
        linkedList.add("Anu");
        linkedList.add("Andy");
        linkedList.add("Null");
        System.out.println(linkedList);

        linkedList.addFirst("aaa"); // Add element at first location
        linkedList.addLast("zzz"); // Add element at last location
        System.out.println(linkedList);

        linkedList.set(2,"anuja"); // replace the value at specified index
        System.out.println(linkedList);

        linkedList.remove(1); // To remove the data at specified location
        System.out.println(linkedList);
        linkedList.remove("Andy");
        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty()); // to check linked list is empty or not
        linkedList.clear(); // To clear liked list
        System.out.println(linkedList.isEmpty());

    }

}
