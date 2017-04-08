package com.mykola.spring.test;

/**
 * Created by mtverdok on 4/7/2017.
 */
public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using Factory to create person.");
        return new Person(id, name);
    }
}
