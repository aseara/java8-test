package com.aseara.java8test;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/4/2
 * Time: 16:05
 */
public class Test2 {

    @Test
    public void testFormula() {
        final Formula formula = a -> Math.sqrt(a * 100);
        formula.calculate(100);
        formula.sqrt(16);
    }

    @Test
    public void testLambda() {
        List<String> names = asList("peter", "anna", "mike", "xenia");
        System.out.println(names);
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    }

    @Test
    public void testFunctionInterface() {
        Converter<String, Integer> converter = Integer::valueOf;
        int converted = converter.convert("123");
        System.out.println(converted);

        Converter<String, String> converter1 = from -> String.valueOf(from.charAt(0));
        String converted1 = converter1.convert("Java");
        System.out.println(converted1);
    }

    @Test
    public void testFunctionInterface2() {
        PersonFactory<Person> pf = Person::new;
        Person person = pf.create("Peter", "Parker");
        System.out.println(person);
    }

    @Test
    public void testBuildInFunctionInterface() {
        Predicate<String>  predicate = s -> s.length() > 0;
        System.out.println(predicate.test("foo"));
        System.out.println(predicate.negate().test("foo"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");
    }


}
