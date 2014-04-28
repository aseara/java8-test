package com.aseara.java8test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/4/11
 * Time: 14:38
 */
public class Test4 {

    @Test
    public void test() {
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "value" + i);
        }

        //map.forEach((id, val) -> System.out.println(val));

        map.computeIfPresent(3, (num, val) -> val + num);
        System.out.println(map.get(3));

        map.computeIfPresent(9, (num, val) -> null);
        System.out.println(map.containsKey(9));

        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println(map.containsKey(23));

        map.computeIfAbsent(3, num -> "bam");
        System.out.println(map.get(3));

        map.remove(3, "value3");
        System.out.println(map.get(3));

        map.remove(3, "value33");
        System.out.println(map.get(3));

        System.out.println(map.getOrDefault(42, "not found"));

        Function f;

    }
}
