package com.fraerboll.streamAPI.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewTask {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "fig");
        List<String> result = strings.stream()
                .filter(x->x.length()>4)
                .map(String::toUpperCase)
                .toList();




}
