package com.fraerboll.streamAPI.tasks.unsolved;

import com.fraerboll.streamAPI.tasks.records.Product;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 999.99),
                new Product("Phone", "Electronics", 699.99),  // Опечатка в "Electronics"!
                new Product("Book", "Education", 19.99),
                new Product("Monitor", "Electronics", 199.99)
        );

        Double sum  = products.stream()
                .filter(p->p.category().toLowerCase().matches("electronic|electro") || p.category().toLowerCase().contains("elect"))
                .mapToDouble(Product::price)
                .sum();
        System.out.println(sum);

        //Более оптимизированная версия (без matches, только contains)
        double sum2 = products.stream()
                .filter(p -> p.category().toLowerCase().contains("electro"))  // Проще и надёжнее
                .mapToDouble(Product::price)
                .sum();
        System.out.println(sum);  // Вывод: 1899.97

    }
}
