package com.cwp.基础部分;

import java.util.Scanner;

public class 最小公倍数最大公约数 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入x的值");
        int x = s.nextInt();
        System.out.println("请输入y的值");
        int y = s.nextInt();
        for (int a = 1; a <= x * y; a++) {
            if (a % x == 0 && a % y == 0) {
                System.out.println("x和y的最小公倍数为" + a);
                break;
            }
        }
        System.out.println("Hello World!");
        int max = (x > y) ? x : y;
        for (int b = max; b <= max; b--) {
            if (x % b == 0 && y % b == 0) {
                System.out.println("x和y的最大公约数为" + b);
                break;
            }
        }
        s.close();
    }

}
