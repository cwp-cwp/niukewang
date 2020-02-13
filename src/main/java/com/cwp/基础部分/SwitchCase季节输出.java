package com.cwp.基础部分;

import java.util.Scanner;

public class SwitchCase季节输出 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = s.nextInt();
        switch (month) {
            case 3:
                System.out.println("春天");
                break;
            case 4:
                System.out.println("春天");
                break;
            case 5:
                System.out.println("春天");
                break;
            case 6:
                System.out.println("夏天");
                break;
            case 7:
                System.out.println("夏天");
                break;
            case 8:
                System.out.println("夏天");
                break;
            case 9:
                System.out.println("秋天");
                break;
            case 10:
                System.out.println("秋天");
                break;
            case 11:
                System.out.println("秋天");
                break;
            case 12:
                System.out.println("冬天");
                break;
            case 1:
                System.out.println("冬天");
                break;
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        s.close();
    }

}
