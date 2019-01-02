package com.netease.java8test;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @Author: bjshaohang
 * @Description:
 * @Date: Created in 13:02 2018/10/18
 */
public class BigdecimalTest {
    public static void main(String[] args) {
        BigDecimal aaa = new BigDecimal(3969.00);

        System.out.println(
                (aaa.subtract(BigDecimal.valueOf(10))).divide(BigDecimal.valueOf(10),BigDecimal.ROUND_HALF_UP));
    }

    private static int intRandom(int start, int end) {
        return new Random().ints(start, end + 1).findAny().getAsInt();
    }

}
