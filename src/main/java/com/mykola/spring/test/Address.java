package com.mykola.spring.test;

/**
 * Created by mtverdok on 4/6/2017.
 */
public class Address {
    private String street;
    private String postcode;

    public Address() {

    }

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init() {
        System.out.println("Bean created " + this);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
