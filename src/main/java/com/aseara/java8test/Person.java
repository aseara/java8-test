package com.aseara.java8test;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/4/2
 * Time: 17:01
 */
public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
