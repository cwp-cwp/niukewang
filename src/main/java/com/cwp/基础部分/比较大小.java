package com.cwp.基础部分;

import java.util.Scanner;

public class 比较大小 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入x的值");
        int x = s.nextInt();
        System.out.println("请输入y的值");
        int y = s.nextInt();
        System.out.println("请输入z的值");
        int z = s.nextInt();

        if (x > y) {
            if (z > x) {
                System.out.println(y + "," + x + "," + z);
            } else if (z > y && z < x) {
                System.out.println(y + "," + z + "," + x);
            } else {
                System.out.println(z + "," + y + "," + x);
            }

        } else {
            if (z > y) {
                System.out.println(x + "," + y + "," + z);
            } else if (x < z && z < y) {
                System.out.println(x + "," + z + "," + y);
            } else {
                System.out.println(z + "," + x + "," + y);
            }

        }
        s.close();

    }

}
