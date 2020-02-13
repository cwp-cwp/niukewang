package com.cwp.基础部分;

import java.util.Scanner;

import org.junit.Test;

public class 冒泡法 {

    @Test
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组元素个数:");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("请输入" + n + "个数");
        for (int i = 0; i < array1.length; i++) {
            int x = scanner.nextInt();
            array1[i] = x;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = 0; j < array1.length - i - 1; j++) {
                if (array1[j] >= array1[j + 1]) {
                    int temp;
                    temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}
