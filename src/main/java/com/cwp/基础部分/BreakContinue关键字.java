package com.cwp.基础部分;


import org.junit.Test;

/**
 * break:使用在switch-case中或者循环中 如果使用在循环中，表示：结束"当前"循环
 * <p>
 * continue:使用在循环结构中 表示：结束"当次"循环
 * <p>
 * 关于break和continue中标签的使用。（理解）
 */

public class BreakContinue关键字 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j < 20; j++) {
                if (j % 3 == 0 || j % 5 == 0 || j % 7 == 0) {
                    // break;//break和continue后面不能写语句,应为永远也不可能被执行！
                    continue;
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    @Test
    public void test1() {
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 100; y++) {
                if (y % 3 == 0 || y % 5 == 0 || y % 7 == 0) {
                    continue;
                } else {
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
