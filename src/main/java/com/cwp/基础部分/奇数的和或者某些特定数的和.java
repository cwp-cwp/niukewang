package com.cwp.基础部分;

import org.junit.Test;

public class 奇数的和或者某些特定数的和 {

    public static void main(String[] args) {

        int j;
        int sum = 0;
        for (j = 1; j <= 100; j++) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
                sum += j;
            }
        }
        System.out.println();
        System.out.println("奇数的和为：sum=" + sum);

        int i;
        int count = 0;
        int sum2 = 0;
        for (i = 0; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
                count++;
                sum2 += i;
            }
        }
        System.out.println();
        System.out.println("7的倍数有 " + count + "个");
        System.out.println("7的倍数的所有数的和为:sum=" + sum2);
    }

    @Test
    public void test1() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(i + " ");
            }
        }
        System.out.println(sum);
    }

}
