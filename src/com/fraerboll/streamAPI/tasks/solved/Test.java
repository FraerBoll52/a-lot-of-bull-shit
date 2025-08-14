package com.fraerboll.streamAPI.tasks.solved;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {


        InputStream is = Test.class.getResourceAsStream("/test.txt");
        Stream<String> lines = new BufferedReader(new InputStreamReader(is)).lines();
        System.out.println(Arrays.toString(lines.toArray()));
        List<String> list = new ArrayList<>();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(x -> x * x)
                .toList();
        System.out.println(squares);

        List<String> words = Arrays.asList("Java", "Stream", "API", "Lambda");
        List<String> fives = words.stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(fives);

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        Integer even = nums.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println(even);

        List<String> languages = List.of("Java", "Python", "C++", "JavaScript");
        String result = languages.stream()
                .collect(Collectors.joining(","));
        System.out.println(result);

        List<String> word = List.of("apple", "banana", "avocado", "grape", "kiwi", "mango");
        List<String> res = word.stream()
                .filter(x -> x.contains("a")).toList()
                .stream().limit(3).toList();
        System.out.println(res);

        List<Integer> num = List.of(10, 5, 8, 3, 15);
        Optional<Integer> r = num.stream()
                .reduce((a, b) -> a < b ? a : b);
        System.out.println(r);

        List<String> words2 = List.of("Java", "Stream", "API", "Lambda");
        List<String> result2 = words2.stream()

                .map(x -> x = String.valueOf(x.length()))
                .collect(Collectors.toList());
        System.out.println(result2);

        List<String> words3 = List.of("Java", "Stream");
        String result3 = words3.stream()
                .flatMap(x -> x.chars().mapToObj(c -> (char) c))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(result3);

        List<Integer> numbers2 = List.of(10, 20, 30, 40);
        OptionalDouble result4 = numbers2.stream()
                .mapToInt(Integer::valueOf)
                .average();
        System.out.println(result4);

        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> result5 = numbers3.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(result5);


    }
}

