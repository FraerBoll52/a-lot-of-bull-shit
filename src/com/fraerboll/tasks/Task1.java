package com.fraerboll.tasks;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//just a lot of StreamAPI tasks
public class Task1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        Order order = new Order();
        String monthKey = order.getDate().format(formatter);
        // 1. Из коллекции:
        //List<String> list = List.of("a", "b", "c");
        //Stream<String> stream1 = list.stream();

        // 2. Из массива:
        String[] array = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(array);

        // 3. Из значений:
        Stream<String> stream3 = Stream.of("a", "b", "c");

        // 4. Бесконечный Stream (с ограничением):
        //Stream<Integer> numbers = Stream.iterate(0, n -> n + 1).limit(10); // 0,1,2,...,9

        List<Order> orders = List.of(
                new Order("A101", List.of(
                        new Product("Laptop", 1200.0),
                        new Product("Mouse", 45.0)
                ), LocalDate.of(2023, 1, 10)),

                new Order("A102", List.of(
                        new Product("Keyboard", 80.0),
                        new Product("Monitor", 300.0)
                ), LocalDate.of(2023, 2, 15)),

                new Order("A103", List.of(
                        new Product("Laptop", 1200.0),
                        new Product("Headphones", 150.0)
                ), LocalDate.of(2023, 2, 20))
        );



        orders.stream()
                .flatMap(o -> o.getProducts().stream())
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(3)
                .forEach(System.out::println);


        double orderSum = order.getProducts().stream()
                .mapToDouble(Product::getPrice)
                .sum();


    }
}
