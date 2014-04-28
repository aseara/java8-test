package com.aseara.java8test;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/3/25
 * Time: 17:11
 */
public class Test1 {

    @Test
    public void test() {
        final List<BigDecimal> prices = Arrays.asList(
                new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
                new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
                new BigDecimal("45"), new BigDecimal("12")
        );

        final BigDecimal totalOfDiscountedPrices = prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }

    @Test
    public void test2() {
        final List<String> friends = Arrays.asList(
                "Brian", "Nate", "Neal", "Raju", "Sara", "Scott"
        );

        friends.forEach(System.out::println);
        System.out.println();
        friends.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println();
        friends.stream()
                .map(String::length)
                .forEach(count -> System.out.print(count + " "));
        System.out.println();
        final List<String> startWithN =
                friends.stream()
                .filter(name -> name.startsWith("N"))
                .collect(Collectors.toList());
        System.out.println(String.format("Found %d names", startWithN.size()));

    }

    @Test
    public void test3() {
        final List<String> friends = Arrays.asList(
                "Brian", "Nate", "Neal", "Raju", "Sara", "Scott"
        );

        final Function<String, Predicate<String>> startWithLetter =
                letter -> name -> name.startsWith(letter);

        final long countFriendsStartWithN =
                friends.stream()
                .filter(startWithLetter.apply("N"))
                .count();

        final long countFriendsStartWithB =
                friends.stream()
                .filter(startWithLetter.apply("B"))
                .count();

        System.out.println("countFriendsStartWithN: " + countFriendsStartWithN);
        System.out.println("countFriendsStartWithB: " + countFriendsStartWithB);

    }

    @Test
    public void test4() {
        final List<String> friends = Arrays.asList(
                "Brian", "Nate", "Neal", "Raju", "Sara", "Scott"
        );

        Consumer<String> foundName =
                startLetter -> {
                    Optional<String> found = friends.stream()
                            .filter(name -> name.startsWith(startLetter))
                            .findFirst();
                    System.out.println(String.format("A name start with %s: %s",
                            startLetter, found.orElse("name not found")));
                };

        foundName.accept("A");
        foundName.accept("N");
    }

    @Test
    public void test5() {
        final List<String> friends = Arrays.asList(
                "Brian", "Nate", "Neal", "Raju", "Sara", "Scott"
        );
        System.out.println("Total number of characters in all names: " +
        friends.stream().mapToInt(String::length).sum());

        final Optional<String> aLongName =
                friends.stream()
                .reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

        aLongName.ifPresent(name ->
                System.out.println(String.format("A long name: " + name)));

        System.out.println(friends.stream()
        .map(String::toUpperCase).collect(Collectors.joining(", ")));
    }

    @Test
    public void test6() {
        final String str = "w00t";
        str.chars()
                .filter(Character::isDigit)
                .mapToObj(ch -> (char)ch)
                .forEach(System.out::println);
    }

}
