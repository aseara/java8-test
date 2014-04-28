package com.aseara.java8test;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/4/2
 * Time: 16:06
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
