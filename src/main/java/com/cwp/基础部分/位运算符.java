package com.cwp.基础部分;

/**
 * 位运算<<,>>,>>>,$,|,^,~
 */
public class 位运算符 {

    public static void main(String[] args) {
        int m = 12;
        int n = 5;
        int temp;

        temp = m;
        m = n;
        n = temp;
        System.out.println("m=" + m + "  n=" + n);
        System.out.println(5 << 2);// 左移2位
        System.out.println(5 >> 2);// 右移2位
        System.out.println(5 >>> 5);// 无符号右移5位
        System.out.println(15 & 4);// 与运算
        System.out.println(12 | 5);// 或运算
        System.out.println(45 ^ 5);// 异或运算
        System.out.println(~12);// 反码

    }

}
