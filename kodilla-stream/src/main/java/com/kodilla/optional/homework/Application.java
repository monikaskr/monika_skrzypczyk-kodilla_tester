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
        students.add(new Student("Adaś", new Teacher ("Pani Klara")));
        students.add(new Student("Tomek", new Teacher ("Pani Zofia")));
        students.add(new Student("Ala", null));
        students.add(new Student("Krzyś", new Teacher ("Pani Klara")));

        for(Student s: students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(s.getTeacher());
            String teachername =
                    optionalTeacher.orElse(new Teacher("<undified>")).getName();
            System.out.println(teachername);
        }
        return students;
    }
}
