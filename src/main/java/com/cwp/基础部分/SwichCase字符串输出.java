package com.cwp.基础部分;

public class SwichCase字符串输出 {

    public static void main(String[] args) {
        int i = 4;
        switch (i) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("Hello World!");
                break;

        }

        String str = "abc";
        switch (str) {
            case "cdb":
                System.out.println("cdb");
                break;
            case "ewn":
                System.out.println("ewn");
                break;
            case "abc":
                System.out.println("ABC");
                break;
            default:
                System.out.println("其他");
                break;
        }
    }
}
