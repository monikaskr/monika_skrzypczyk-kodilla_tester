package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<String> usernames = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getLocalDateDeadline().equals((LocalDate.of(2021, 12, 20))))
                .map(TaskManager::getName)
                .collect(Collectors.toList());
                System.out.println(usernames);
    }
    public static String getName(Task task) {
        return task.getName();
    }
}
