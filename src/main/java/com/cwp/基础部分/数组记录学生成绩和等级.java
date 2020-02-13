package com.cwp.基础部分;

import java.util.Scanner;

public class 数组记录学生成绩和等级 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int n = s.nextInt();
        double[] d = new double[n];
        System.out.println("您输入的学生个数为  " + n + " 个！");
        for (int i = 0; i < d.length; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个学生的成绩：");
            d[i] = s.nextDouble();
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println("第" + (i + 1) + "个学生的成绩为：" + d[i] + "分");
        }
        double max = d[0];
        for (int i = 0; i < d.length; i++) {
            if (d[i] > max) {
                max = d[i];
            }
        }
        System.out.println("最高分为 " + max + " 分！");
        char level = ' ';
        for (int i = 0; i < d.length; i++) {
            if (d[i] >= (max - 10)) {
                level = 'A';
            } else if (d[i] >= (max - 20)) {
                level = 'B';
            } else if (d[i] >= (max - 30)) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("第" + (i + 1) + "个学生等级为" + level);
        }
    }

}
