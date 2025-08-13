package com.fraerboll.tasks;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Order {
    String id;
    List<Product> products;
    LocalDate date;

    public Order(String id, List<Product> products, LocalDate date) {
        this.id = id;
        this.products = products;
        this.date = date;
    }

    public Order() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
