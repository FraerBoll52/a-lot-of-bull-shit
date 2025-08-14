package com.fraerboll.streamAPI.tasks.solved;

import com.fraerboll.streamAPI.tasks.records.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class InterviewTask {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 3000),
                new Employee("Bob", "IT", 5000),
                new Employee("Charlie", "IT", 4000),
                new Employee("David", "HR", 3500)
        );

        //группируем по отделам и вычисляем среднюю зп
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.averagingDouble(Employee::salary)
                ));

        //максимальная зарплата в каждом отделе
        Map<String, Optional<Employee>> maxSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.maxBy(Comparator.comparing(Employee::salary))
                ));

        //количество сотрудников в каждом отделе
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.counting()
                ));

        //фильтр слов у которых длина больше 4 символов (далее приведение этих слов к верхнему регистру)
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> result = strings.stream()
                .filter(x->x.length()>4)
                .map(String::toUpperCase)
                .toList();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> sortedNumbers = numbers.stream()
                .collect(Collectors.partitioningBy(x->x%2==0));

}
