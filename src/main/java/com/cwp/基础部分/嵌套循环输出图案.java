package com.cwp.基础部分;

import org.junit.Test;

public class 嵌套循环输出图案 {
    /**
     * 嵌套循环输出图案
     * ***
     * ***
     * ***
     * ***
     */
    @Test
    public void test1() {
        for (int j = 1; j < 5; j++) {
            for (int i = 1; i < 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 使用嵌套循环输出图案  //外层循环控制行数，内层循环控制列数
     * <p>
     * *
     * **
     * ***
     */
    @Test
    public void test2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 使用嵌套循环输出图案
     * <p>
     * *
     * **
     * ***
     * **
     * *
     */
    @Test
    public void test3() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 使用嵌套循环输出图案
     * <p>
     * *
     * * *
     * * * *
     * * *
     * *
     */
    @Test
    public void test4() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4 - i; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("-");
            }
            for (int k = 0; k < 3 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
