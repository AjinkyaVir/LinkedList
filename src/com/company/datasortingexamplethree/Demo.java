package com.company.datasortingexamplethree;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

    public static void main(String[] args) {

        /*
        * Collection sorting data
        * The data must be Homogeneous
        * Must implements Comparable interface
        *
        * ==>> To perform sorting Collection.sort() method required
        *
        * ====>>> Internally compareTo() method executed
        *
        * */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Aju");
        arrayList.add("Sau");
        arrayList.add("anu");
        arrayList.add("raju");
        arrayList.add("Rupa");
        System.out.println("Before sorting data :: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting data :: " + arrayList);

    }

}
