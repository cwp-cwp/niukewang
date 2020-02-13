package com.cwp.基础部分;

public class 逻辑运算符 {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 && b2);
        System.out.println(b1 | b2);
        System.out.println(b1 || b2);
        System.out.println(b1 ^ b2);
        System.out.println(!b2);

        // &:不管左边是true还是false,右边都进行运算
        // &&：如果左边是false,右边不再进行运算
        // 以后使用时，建议使用&&
        int i1 = 10;
        if (b2 & i1++ > 0) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }
        System.out.println(i1);// i1=11

        int i2 = 10;
        if (b2 && i2++ > 0) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }
        System.out.println(i2);// i2=10

        // |与||的区别
        // | 不管左端为ture还是false,右端都进行运算
        // || 如果左端为ture，右端不再进行运算
        // 使用时建议用 ||
        int i3 = 10;
        if (b1 | i3++ > 0) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }
        System.out.println(i3);// i3=11

        int i4 = 10;
        if (b1 || i4++ > 0) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }
        System.out.println(i4);// i4=10

    }

}
