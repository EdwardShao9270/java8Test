package com.netease.java8test;

import java.util.Optional;

/**
 * @Author: bjshaohang
 * @Description:
 * @Date: Created in 17:05 2018/10/12
 */
public class OptionalTest {
    public static void main(String[] args) {
        OptionalTest optionalTest = new OptionalTest();
        Integer value1 = null;
        Integer value2 = 10;
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println(optionalTest.sum(a, b));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b){
        //Optional.isPresent  判断该值是否存在
        System.out.println("第一个参数值存在：" + a.isPresent());
        System.out.println("第二个参数值存在：" + b.isPresent());

        Integer value1 = a.orElse(0);
        Integer value2 = b.isPresent()? b.get() : 0;
        return value1 + value2;
    }


}
