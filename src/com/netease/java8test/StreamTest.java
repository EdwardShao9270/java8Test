package com.netease.java8test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @Author: bjshaohang
 * @Description:
 * @Date: Created in 15:46 2018/10/12
 */
public class StreamTest {
    public static void main(String[] args) {
        //生成流
        //串行流
        List<String> stringList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> serialFilterList = stringList.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        serialFilterList.forEach(s -> System.out.print(s + " "));
        System.out.println();
        //并行流
        List<String> parallelFilterList = stringList.parallelStream().filter(str -> str.length() > 2).collect(Collectors.toList());
        parallelFilterList.forEach(s -> System.out.print(s + " "));

        //foreach && limit && sorted

        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
        System.out.println();

        //map
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> mapFilterList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        mapFilterList.forEach(s -> System.out.print(s + " "));
        System.out.println();

        //filter
        int count = (int) stringList.stream().filter(str -> str.isEmpty()).count();
        System.out.println("empty count is " + count);

        //Collectors
        String collectorString= stringList.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(","));
        System.out.println(collectorString);

        //statistic
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

    }


}
