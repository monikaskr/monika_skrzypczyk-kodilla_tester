package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person (String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public void showResponsibilisties(){
        System.out.println(this.firstName + " " + job.getResponsibilities());

    }

    public static void main(String[] args) {
        Person aga = new Person("Aga", 20, new Operator());
        Person beti = new Person("Beti", 33, new QualityEngineer());
        Person tom = new Person("Tom", 58, new Technologist());
        Person michal = new Person("Michał", 13, new Operator());

        aga.showResponsibilisties();
        beti.showResponsibilisties();
        tom.showResponsibilisties();
        michal.showResponsibilisties();
    }
}
