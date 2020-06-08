package com.company.datasortingexamplefive;

public class Product implements Comparable<Product>{

    int p_id;
    String p_name;
    double p_cost;

    public Product(int p_id, String p_name, double p_cost) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_cost = p_cost;
    }

    @Override
    public int compareTo(Product o) {
        if (p_id == o.p_id) return 0;
        else if (p_id > o.p_id){
           return 1;
       }else {
           return -1;
       }
    }
}
