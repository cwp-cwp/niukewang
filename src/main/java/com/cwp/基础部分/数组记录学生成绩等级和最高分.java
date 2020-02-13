package com.cwp.基础部分;

import java.util.Scanner;

import org.junit.Test;

public class 数组记录学生成绩等级和最高分 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生个数");
        int n = s.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生成绩");
            int score = s.nextInt();
            a[i] = score;
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("最高分为" + max);
        for (int i = 0; i < a.length; i++) {
            char level;
            if (a[i] > max - 10) {
                level = 'A';
            } else if (a[i] > max - 20) {
                level = 'B';
            } else if (a[i] > max - 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out
                    .println("第" + (i + 1) + "个学生成绩为" + a[i] + ",等级为" + level);
        }

        s.close();
    }

    @Test
    public void test1() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int n = s.nextInt();
        double[] d = new double[n];
        double max = 0;
        System.out.println("请输入" + n + "个数：");
        for (int i = 0; i < d.length; i++) {

            d[i] = s.nextDouble();
            if (d[i] > max) {
                max = d[i];
            }
        }

        System.out.println("max = " + max);

    }
}
