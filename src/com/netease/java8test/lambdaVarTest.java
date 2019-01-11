package com.netease.java8test;

/**
 * @Author: bjshaohang
 * @Description:
 * @Date: Created in 10:20 2018/10/12
 */
public class lambdaVarTest {
    public static void main(String args[]) {
        int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);
        //num = 5;
    }

    public interface Converter<T1, T2> {
        void convert(int i);

    }

}
