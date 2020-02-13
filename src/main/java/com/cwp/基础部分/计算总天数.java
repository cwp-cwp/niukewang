package com.cwp.基础部分;

import java.util.Scanner;

import org.junit.Test;

public class 计算总天数 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = s.nextInt();
        System.out.println("请输入月份");
        int month = s.nextInt();
        System.out.println("请输入日期");
        int day = s.nextInt();

        int m1 = 31, m3 = 31, m4 = 30, m5 = 31, m6 = 30, m7 = 31, m8 = 31, m9 = 30, m10 = 31, m11 = 30, m12 = 31;
        int m2;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            m2 = 29;
        else
            m2 = 28;
        if (month == 1)
            System.out.println(day);
        else if (month == 2)
            System.out.println(m1 + day);
        else if (month == 3)
            System.out.println(m1 + m2 + day);
        else if (month == 4)
            System.out.println(m1 + m2 + m3 + day);
        else if (month == 5)
            System.out.println(m1 + m2 + m3 + m4 + day);
        else if (month == 6)
            System.out.println(m1 + m2 + m3 + m4 + m5 + day);
        else if (month == 7)
            System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + day);
        else if (month == 8)
            System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + day);
        else if (month == 9)
            System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + day);
        else if (month == 10)
            System.out
                    .println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + day);
        else if (month == 11)
            System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10
                    + day);
        else
            System.out.println(m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10
                    + m11 + day);
        s.close();
    }

    @Test
    public void test() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = s.nextInt();
        System.out.println("请输入月份");
        int month = s.nextInt();
        System.out.println("请输入日期");
        int day = s.nextInt();
        int sum = 0;
        switch (month) {
            case 12:
                sum += 30;
            case 11:
                sum += 31;
            case 10:
                sum += 30;
            case 9:
                sum += 31;
            case 8:
                sum += 31;
            case 7:
                sum += 30;
            case 6:
                sum += 31;
            case 5:
                sum += 30;
            case 4:
                sum += 31;
            case 3: {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    sum += 28;
                } else
                    sum += 28;
            }
            case 2:
                sum += 31;
            case 1:
                sum += day;
        }
        System.out.println(sum);
        s.close();
    }
}
