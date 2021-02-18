package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(c -> c.getAge() >= 40)
                .map(u -> u.getNumberOfPost() )
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("AVG posts for User >= 40 age: " + avg);

        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(c -> c.getAge() < 40)
                .map(u -> u.getNumberOfPost() )
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("AVG posts for User < 40 age: " + avg2);

    }
}
