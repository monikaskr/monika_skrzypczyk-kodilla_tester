package com.kodilla.collections.sets.homewor;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("a", 2, true));
        stamps.add(new Stamp("b", 2.5, false));
        stamps.add(new Stamp("c", 1, true));
        stamps.add(new Stamp("d", 1.5, false));
        stamps.add(new Stamp("b", 2.5, true));
        stamps.add(new Stamp("d", 1.5, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
