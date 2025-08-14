package com.fraerboll.streamAPI.tasks;

import com.fraerboll.streamAPI.tasks.records.Student;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", Arrays.asList(85, 90, 78)),
                new Student("Bob", Arrays.asList(92, 88, 91)),
                new Student("Charlie", Arrays.asList(76, 89, 84))
        );

        List<String> topStudents = students.stream()
                .filter(student ->
                        student.grades().stream()
                                .mapToDouble(Integer::doubleValue)
                                .average()
                                .orElse(0) >= 85
                )
                .map(Student::name)
                .toList();
    }
}
