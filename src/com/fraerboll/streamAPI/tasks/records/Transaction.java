package com.fraerboll.streamAPI.tasks.records;

public record Transaction(String id, String accountFrom, String accountTo, double amount, String currency) {
}
