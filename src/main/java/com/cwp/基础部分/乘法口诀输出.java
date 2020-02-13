package com.cwp.基础部分;

public class 乘法口诀输出 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("Hello World!");
    }

}
