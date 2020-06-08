package com.company.datasortingexamplesix;

import java.util.Comparator;

public class ProIdComp implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.p_id, o2.p_id);
    }
}
