package com.cwp.基础部分;

import java.util.Scanner;

public class 直接排序法 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double d[] = new double[10];
        System.out.println("请输入10个数：");
        for (int i = 0; i < d.length; i++) {
            d[i] = s.nextDouble();
        }
        System.out.println("原数组为：");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        //使用直接选择排序使数组元素从小到大排列
        for (int i = 0; i < d.length - 1; i++) {
            int t = i;//默认i处是最小的
            for (int j = i; j < d.length; j++) {
                //一旦在i后发现存在比其小的元素，就记录那个元素的下角标
                if (d[t] > d[j]) {
                    t = j;
                }
//				if(d[t] < d[j]){ //从大到小排序
//					t = j;
//				}
            }
            if (t != i) {
                double temp = d[t];
                d[t] = d[i];
                d[i] = temp;
            }
        }
        System.out.println("排序后的数组为：");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }

}
