package com.cwp.基础部分;

import java.util.Scanner;

import org.junit.Test;

public class 数组的常用计算 {

    @Test
    public void testGetMax() {
        getMax();
    }

    @Test
    public void testGetSum() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数组元素的个数：");
        int n = s.nextInt();
        double d[] = new double[n];
        System.out.println("请输入" + n + "个数：");
        for (int i = 0; i < n; i++) {
            d[i] = s.nextDouble();
        }
        getSum(d);
    }

    @Test
    public void testGetReverse() {
        getReverse();
    }

    /**
     * 求最大值
     */
    public static void getMax() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数组元素的个数：");
        while (s.hasNext()) {

            int n = s.nextInt();
            double[] d = new double[n];
            System.out.println("请输入" + n + "个数：");
            for (int i = 0; i < n; i++) {
                double x = s.nextDouble();
                d[i] = x;
            }
            double max = d[0];
            for (int i = 0; i < d.length; i++) {
                if (d[i] > max) {
                    max = d[i];
                }
            }
            System.out.println("max = " + max);
        }
    }

    /**
     * 求和
     */
    public static void getSum(double[] d) {
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        System.out.println("sum = " + sum);
    }

    /**
     * 数组的反转
     */
    public static void getReverse() {
        Scanner s = new Scanner(System.in);
        double[] d = new double[10];
        System.out.println("请输入10个数：");
        for (int i = 0; i < 10; i++) {
            d[i] = s.nextDouble();
        }
        System.out.println("原数组为：");
        for (int i = 0; i < 10; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        for (int i = 0, j = d.length - 1; i < j; i++, j--) {
            double temp;
            temp = d[i];
            d[i] = d[j];
            d[j] = temp;
        }
        System.out.println("反转后的数组为：");
        for (int i = 0; i < 10; i++) {
            System.out.print(d[i] + " ");
        }
    }
}
