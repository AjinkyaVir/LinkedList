package com.company.linkedlistexampletwo;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        books.add(new Book(101,"Java","Ajinkya"));
        books.add(new Book(102,"C++","Sayali"));
        books.add(new Book(103,"C","Rupali"));



        // Remove data using lit iterator
        ListIterator<Book> listIterator = books.listIterator();
        while (listIterator.hasNext()){
            Book s = listIterator.next();
            if (s.name.equals("C")){
                listIterator.remove();
            }
        }

        // remove data using for each loop

        for (Book bb: books
             ) {
            System.out.println(bb.id+ " " + bb.name + " " + bb.author);
        }


    }



}
