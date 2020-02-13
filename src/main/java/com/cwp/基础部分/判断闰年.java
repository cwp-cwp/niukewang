package com.cwp.基础部分;

import java.util.Scanner;

public class 判断闰年 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int n = s.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
            System.out.println("闰年");
        else
            System.out.println("平年");
        s.close();
    }

}
