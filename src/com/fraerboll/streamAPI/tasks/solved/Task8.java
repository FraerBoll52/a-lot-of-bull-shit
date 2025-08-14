package com.fraerboll.streamAPI.tasks.solved;

import com.fraerboll.streamAPI.tasks.records.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0, 15),
                new Product("Phone", "Electronics", 800.0, 32),
                new Product("Desk", "Furniture", 300.0, 8),
                new Product("Chair", "Furniture", 150.0, 24),
                new Product("Monitor", "Electronics", 250.0, 18),
                new Product("Keyboard", "Electronics", 100.0, 45)
        );

//        Map<String, List<Product>> stats = products.stream()
//                .collect(Collectors.groupingBy(Product::category));
//
//        Double total = products.stream()
//                .mapToDouble(p -> p.price() * p.sold()).sum();
//
//        String topProduct = products.stream()
//                .filter(s -> s.equals("Furniture"))
//                .max(Comparator.comparingDouble(Product::sold))
//                .map(Product::name)
//                .orElse("N/A");

        Map<String, Map<String, Object>> result = products.stream()
                .collect(Collectors.groupingBy(
                        Product::category,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    double totalRevenue = list.stream()
                                            .mapToDouble(p -> p.price() * p.sold())
                                            .sum();

                                    String topProduct = list.stream()
                                            .max(Comparator.comparingInt(Product::sold))
                                            .map(Product::name)
                                            .orElse("N/A");

                                    return Map.of(
                                            "totalRevenue", totalRevenue,
                                            "topProduct", topProduct
                                    );
                                }
                        )
                ));

        System.out.println(result);
    }


}
