package com.cwp.基础部分;

import java.util.Scanner;

import org.junit.Test;

/**
 * 无限循环：for(;;){}
 * while(true){}
 * 使用break终止循环
 */
public class 求输入整数的个数 {

    @Test
    public void test1() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数");
            int sum = s.nextInt();
            if (sum > 0) {
                a++;
            } else if (sum < 0) {
                b++;
            } else {
                c++;
            }
        }
        System.out.println("正整数的个数为" + a + "个");
        System.out.println("负整数的个数为" + b + "个");
        System.out.println("0的个数为" + c + "个");
        s.close();
    }

    @Test
    public void test2() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        for (; ; ) {
            System.out.println("请输入一个整数");
            int sum = s.nextInt();
            if (sum > 0) {
                a++;
            } else if (sum < 0) {
                b++;
            } else
                break;
        }
        System.out.println("正整数的个数为" + a + "个");
        System.out.println("负整数的个数为" + b + "个");
        s.close();
    }

    @Test
    public void test3() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        // while(true){
        do {
            System.out.println(" 请输入一个整数");
            int sum = s.nextInt();
            if (sum > 0) {
                a++;
            } else if (sum < 0) {
                b++;
            } else
                break;
        } while (true);
        System.out.println("正整数的个数为" + a + "个");
        System.out.println("负整数的个数为" + b + "个");
        s.close();
    }

    @Test
    public void test4() {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int b = 0;
        while (true) {
            System.out.println("请输入一个整数：");
            int x = s.nextInt();
            if (x > 0) {
                a++;
            } else if (x < 0) {
                b++;
            } else {
                break;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
