package com.fraerboll.streamAPI.tasks.unsolved;

import com.fraerboll.streamAPI.tasks.records.Transaction;

import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", "A1", "A2", 100.0, "USD"),
                new Transaction("T2", "A2", "A3", 250.0, "EUR"),
                new Transaction("T3", "A1", "A3", 50.0, "USD"),
                new Transaction("T4", "A3", "A2", 200.0, "EUR"),
                new Transaction("T5", "A2", "A1", 150.0, "USD")
        );

    }
}
