package com.fraerboll.streamAPI.tasks;

import java.util.List;

public class OrderTask {
    public static void main(String[] args) {
        List<Order> uberOrders = List.of(
                new Order("A1", "Иван", 10.5),
                new Order("A2", "Мария", 25.0),
                new Order("A3", "Петр", 50.0)
        );

        List<Order> boltOrders = List.of(
                new Order("A2", "Мария", 25.0),  // Совпадает с Uber
                new Order("A4", "Ольга", 15.0),
                new Order("A3", "Петр", 49.99)    // Не совпадает (цена отличается!)
        );
    }
}
