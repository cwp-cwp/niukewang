package com.cwp.基础部分;

import org.junit.Test;

public class 三元运算符 {

    @Test
    public void test1() {
        int i1 = 12;
        int i2 = 15;
        int max = (i1 > i2) ? i1 : i2;
        System.out.println(max);

        String str = (i1 > i2) ? "i1大" : "i2大";
        System.out.println(str);
    }

    @Test
    public void test2() {
        int i3 = 20;
        int i4 = 20;
        String str2 = (i3 > i4) ? "i3大" : (i3 == i4) ? "一样大" : "i4大";
        System.out.println(str2);
    }

    @Test
    public void test3() {
        int i5 = 16;
        int i6 = 18;
        if (i5 >= i6) {
            System.out.println(i5);
        } else {
            System.out.println(i6);
        }
    }

    // 使用三元运算符输出三个数中最大的一个
    @Test
    public void test4() {
        int a = 12;
        int b = 15;
        int c = 26;
        int max1 = (a > b) ? a : b;
        int max2 = (max1 > c) ? max1 : c;
        System.out.println(max2);
    }

    @Test
    public void test5() {
        int i3 = 16;
        int i4 = 46;
        int i5 = 13;

        if (i3 > i4 && i3 > i5) {
            System.out.println(i3);
        } else if (i4 > i3 && i4 > i5) {
            System.out.println(i4);
        } else if (i5 > i3 && i5 > i4) {
            System.out.println(i5);
        }
    }

}
