package com.netease.java8test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: bjshaohang
 * @Description:
 * @Date: Created in 14:41 2018/10/12
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> predicate = n -> true;
        eval(list,predicate);

        Predicate<Integer> predicate1 = n -> n%2==0;
        eval(list,predicate1);

        Predicate<Integer> predicate2 = n -> n > 3;
        eval(list,predicate2);
    }


    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for (Integer n : list){
            if (predicate.test(n)){
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
