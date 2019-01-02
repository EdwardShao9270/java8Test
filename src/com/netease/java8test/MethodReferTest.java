package com.netease.java8test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: bjshaohang
 * @Description:
 * @Date: Created in 10:35 2018/10/12
 */
public class MethodReferTest {
    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }

    public static MethodReferTest create(Supplier<MethodReferTest> supplier) {
        return supplier.get();
    }

    public static void collide(final MethodReferTest car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final MethodReferTest another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    public static void main(String[] args) {
        //构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
        System.out.println("=================构造器引用======================");


        MethodReferTest test = MethodReferTest.create(MethodReferTest::new);
        MethodReferTest test1 = MethodReferTest.create(MethodReferTest::new);
        MethodReferTest test2 = MethodReferTest.create(MethodReferTest::new);
        MethodReferTest test3 = MethodReferTest.create(MethodReferTest::new);

        List<MethodReferTest> methodReferTests = Arrays.asList(test, test1, test2, test3);
        System.out.println("=================静态方法引用======================");
        methodReferTests.forEach(MethodReferTest::collide);

        System.out.println("=================特定对象的方法引用======================");
        methodReferTests.forEach(test1::follow);

        System.out.println("=================特定类的任意对象的方法引用======================");
        methodReferTests.forEach(MethodReferTest::repair);

        //特定对象的方法引用：它的语法是instance::method实例如下：
        System.out.println("===================特定对象的方法引用===================");

        MethodReferTest police = MethodReferTest.create(MethodReferTest::new);
        methodReferTests.forEach(police::follow);
    }
}
