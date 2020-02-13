package com.cwp.基础部分;

/**
 * 一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身正的约数）
 * 例如6=1＋2＋3.编程 找出1000以内的所有完数
 */
public class 完数 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            //每执行完一次如下的循环，就会将i的所有的因子累加到sum中
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);
            }
            sum = 0;
        }
    }

}
