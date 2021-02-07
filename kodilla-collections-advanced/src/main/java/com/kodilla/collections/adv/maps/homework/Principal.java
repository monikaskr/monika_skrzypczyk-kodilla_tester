package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String firstname;
    private String lastname;
    private String nameOfSchool;

    public Principal(String firstname, String lastname, String nameOfSchool) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nameOfSchool = nameOfSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstname, principal.firstname) && Objects.equals(lastname, principal.lastname) && Objects.equals(nameOfSchool, principal.nameOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, nameOfSchool);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }
}
