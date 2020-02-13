package com.cwp.基础部分;

import java.util.Scanner;

public class IfElse判断语句是否嫁人 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);// 创建一个Scanner类的对象

        System.out.println("请输入身高");
        int shengao = s.nextInt();
        System.out.println("请输入财富");
        double caifu = s.nextDouble();
        System.out.println("请输入是否帅，帅输入true，不帅输入false");
        boolean yanzhi = s.nextBoolean();
        // int yanzhi=s.nextInt();

        if (shengao >= 180 && caifu >= 10000000 && yanzhi == true) {
            System.out.println("一定嫁");
        } else if (shengao < 180 && caifu < 10000000 && yanzhi == false) {
            System.out.println("一定不嫁");
        } else {
            System.out.println("嫁吧");
        }

        s.close();

    }

}