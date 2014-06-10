package com.aseara.java8test;

import java.util.stream.IntStream;

/**
 * Created with IntelliJ IDEA.
 * User: aseara
 * Date: 2014/6/9
 * Time: 14:29
 */
public class SerialAndParallelStreamTest {

    public static void main(String[] args) {
        long t0 = System.nanoTime();

        // 初始化一个范围100万整数流,求能被2整除的数字，toArray（）是终点方法
        IntStream.range(0, 1_000_000).filter(p -> p % 2 == 0).toArray();
        long t1 = System.nanoTime();

        // 和上面功能一样，这里是用并行流来计算
        IntStream.range(0, 1_000_000).parallel().filter(p -> p % 2 == 0).toArray();
        long t2 = System.nanoTime();

        System.out.printf("serial: %.2fs, parallel: %.2fs", (t1 - t0) * 1e-9, (t2 - t1) * 1e-9);

    }
}
