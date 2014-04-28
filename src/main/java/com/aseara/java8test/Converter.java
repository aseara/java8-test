package com.aseara.java8test;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/4/2
 * Time: 16:53
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
