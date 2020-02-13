package com.cwp.基础部分;

import org.junit.Test;

public class 累加和连乘 {

    public static void main(String[] args) {

        int i1 = 0;
        int sum1 = 0;
        while (i1 <= 100) {
            sum1 += i1;
            i1++;
        }
        System.out.println(sum1);
        System.out.println("Hello World!");

        int sum2 = 0;
        for (int i2 = 0; i2 <= 100; i2++) {
            sum2 += i2;
        }

        System.out.println(sum2);
        System.out.println("hello world");

        int i3 = 1;
        double sum3 = 1;
        while (i3 <= 100) {
            sum3 *= i3;
            i3++;
        }
        System.out.println(sum3);
        System.out.println("hello world");

        int i = 0;
        int sum = 0;
        do {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println();
        System.out.println(sum);
    }

    @Test
    public void test1() {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    @Test
    public void test2() {
        int i = 1;
        int sum = 1;
        while (i <= 5) {
            sum = sum * i;
            i++;
        }
        System.out.println(sum);
    }

}
