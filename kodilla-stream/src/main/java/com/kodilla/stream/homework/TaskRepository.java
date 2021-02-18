package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add (new Task ("write a list", LocalDate.of(2020,02,10), LocalDate.of(2020, 05, 15)));
        tasks.add (new Task ("clean a window", LocalDate.of(2020,11,18), LocalDate.of(2021, 12, 20)));
        tasks.add (new Task ("cut the flovers", LocalDate.of(2021,01,01), LocalDate.of(2021, 03, 17)));
        tasks.add (new Task ("buy new bread", LocalDate.of(2020,10,01), LocalDate.of(2020, 12, 01)));

            return tasks;
    }
}
