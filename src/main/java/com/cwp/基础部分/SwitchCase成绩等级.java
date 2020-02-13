package com.cwp.基础部分;

import java.util.Scanner;

public class SwitchCase成绩等级 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int score = s.nextInt();
        char level = ' ';

        switch (score / 10) {
            case 10:
            case 9:
                level = 'A';
                break;
            case 8:
            case 7:
                level = 'B';
                break;
            case 6:
                level = 'C';
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                level = 'D';
                break;
            default:
                System.out.println("输入有误");

        }
        System.out.println(level);

        s.close();
    }
}
