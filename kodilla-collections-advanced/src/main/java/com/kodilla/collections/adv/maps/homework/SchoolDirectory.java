package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> student = new HashMap<>();
        Principal mark = new Principal("Mark ", "Stevenson ", "from Hyde Park");
        Principal eve = new Principal("Eve ", "Pinkman ", "from Lincol School");
        Principal tom = new Principal("Tom ", "Simpson ", "from Harvard");

        School markSchool = new School(1.20, 2.15, 3.30, 4.16,5.10);
        School eveSchool = new School(1.13, 2.25, 3.6, 4.8,5.20);
        School tomSchool = new School(1.30, 2.13, 3.22, 4.11,5.7);

        student.put(mark, markSchool);
        student.put(eve, eveSchool);
        student.put(tom, tomSchool);

        for (Map.Entry<Principal, School> studentEntry : student.entrySet())
            System.out.println(studentEntry.getKey().getFirstname() + studentEntry.getKey().getLastname() + studentEntry.getKey().getNameOfSchool() + ", have 5 class, in every class there is : " +
                    studentEntry.getValue() + " students.");
    }
}
