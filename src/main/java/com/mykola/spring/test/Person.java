package com.mykola.spring.test;

/**
 * Created by mtverdok on 4/6/2017.
 */
public class Person {
    private int id;
    private String name;
    private int taxId;
    private Address address;

    public Person() {}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Person getInstance(int id, String name) {
        System.out.println("Creating person using Factory...");
        return new Person(id, name);
    }

    public void speak() {
        System.out.println("Hello I am a person");
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void onCreate() {
        System.out.println("Person: " + this);
    }

    public void onDestroy() {
        System.out.println("Preson destroyed.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", wtf address=" + address +
                '}';
    }
}
