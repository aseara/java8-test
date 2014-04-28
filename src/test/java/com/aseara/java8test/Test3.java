package com.aseara.java8test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/4/3
 * Time: 17:07
 */
public class Test3 {
    private List<String> values;
    private String testName;
    private long t0;
    private long count;


    @Before
    public void init() {
        int max = 10000000;
        values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        t0 = System.nanoTime();
    }

    @Test
    public void testNonParallelStream() {
        testName = "sequential sort";
        count = values.stream().sorted().count();

    }

    @Test
    public void testParallelStream() {
        testName = "parallel sort";
        count = values.parallelStream().sorted().count();
    }

    @After
    public void after() {
        System.out.println(count);

        long t1 = System.nanoTime();

        long mills = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format(testName + " took: %d ms", mills));
    }
}
