package com.cwp.基础部分;

import java.util.Scanner;

public class SwitchCase是否及格输出 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = s.nextInt();

        /*
         * if(score>100||score<0) {System.out.println("输入有误");} else
         * if(score>=60) {System.out.println("及格");} else
         * {System.out.println("不及格");}
         */

        switch (score / 10) {
            case 10:
                System.out.println("及格");
                break;
            case 9:
                System.out.println("及格");
                break;
            case 8:
                System.out.println("及格");
                break;
            case 7:
                System.out.println("及格");
                break;
            case 6:
                System.out.println("及格");
                break;
            case 5:
                System.out.println("不及格");
                break;
            case 4:
                System.out.println("不及格");
                break;
            case 3:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("不及格");
                break;
            case 1:
                System.out.println("不及格");
                break;
            case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入有误");
                break;

        }
        s.close();
    }

}
