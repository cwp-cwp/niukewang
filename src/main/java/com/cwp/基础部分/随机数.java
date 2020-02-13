package com.cwp.基础部分;

import java.util.Random;

import org.junit.Test;

public class 随机数 {
    /**
     * 使用 Random 类产生随机数
     */
    @Test
    public void test1() {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
    }

    /**
     * 使用 Math 类的 random() 方法产生 0-1 之间的随机数
     */
    @Test
    public void test2() {
        double arr[] = new double[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = Math.random();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
