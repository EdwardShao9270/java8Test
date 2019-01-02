package com.netease.java8test;

/**
 * @Author: bjshaohang
 * @Description:
 * @Date: Created in 16:55 2018/10/11
 */
public class MathOperationTest  {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();

        //参数带声明
        MathOperation addition = (int a, int b) -> a + b;
        //参数不带声明
        MathOperation subAddition = (a, b) -> a - b;

        //大括号+返回语句
        MathOperation multiAddition = (int a, int b) ->{
            return a * b;
        };

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10+5 = " + test.operate(10, 5, addition));
        System.out.println("10-5 = " + test.operate(10, 5, subAddition));
        System.out.println("10*5 = " + test.operate(10, 5, multiAddition));
        System.out.println("10/5 = " + test.operate(10, 5, division));

        //带括号实现接口
        GreetingService greetingService = (message) -> System.out.println("hello " + message);

        //不带括号实现接口
        GreetingService greetingService1 = message -> System.out.println("hello " + message);

        greetingService.sayMessage("world!");
        greetingService1.sayMessage("world~");

    }

    interface MathOperation {
        int operate(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }
}
