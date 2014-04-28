package com.aseara.java8test;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/4/2
 * Time: 17:01
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
