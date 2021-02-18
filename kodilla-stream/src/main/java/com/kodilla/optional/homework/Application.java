package com.kodilla.optional.homework;

import com.kodilla.stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        System.out.println(getStudentsList());
    }

    public static List<Student> getStudentsList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adaś", "Pani Klara"));
        students.add(new Student("Tomek", "Pani Zofia"));
        students.add(new Student("Ala", "<undefined>"));
        students.add(new Student("Krzyś", "Pani Klara"));


        Student student = null;

        Optional<Student> optionalStudent = Optional.ofNullable(student);

        String studentname =
                optionalStudent.orElse(new Student("", "")).getName();

        System.out.println(studentname);
        return students;
    }
}
