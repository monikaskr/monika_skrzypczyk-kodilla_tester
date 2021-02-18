package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String name;
    private LocalDate localDateOpened;
    private LocalDate localDateDeadline;

    public Task (String name, LocalDate localDateOpened, LocalDate localDateDeadline){
        this.name = name;
        this.localDateOpened = localDateOpened;
        this.localDateDeadline = localDateDeadline;
    }

    // private static Task of(String name, int localDateOpened, int localDateDeadline) { return new Task(name, localDateOpened, localDateDeadline); }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDateOpened(){
        //LocalDate localDateOpened = LocalDate.of(2010, 10, 15);
        return localDateOpened;
    }
    public LocalDate getLocalDateDeadline(){
        //LocalDate localDateDeadline = LocalDate.of(2015, 02, 20);
        return localDateDeadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(localDateOpened, task.localDateOpened) && Objects.equals(localDateDeadline, task.localDateDeadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localDateOpened, localDateDeadline);
    }
}
