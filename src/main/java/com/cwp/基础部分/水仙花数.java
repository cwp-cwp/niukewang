package com.cwp.基础部分;

import java.util.Scanner;

import org.junit.Test;

public class 水仙花数 {

    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 100; i < 1000; i++) {
            int j1 = i / 100;
            int j2 = (i - (j1 * 100)) / 10;
            int j3 = i % 10;
            if (i == j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("水仙花数的和为:sum=" + sum);
    }

    @Test
    public void test1() {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int sum = 0;
            int m = s.nextInt();
            int n = s.nextInt();
            if (100 <= m && n <= 999) {
                for (int i = m; i < n; i++) {
                    int j1 = i / 100;
                    int j2 = (i - (j1 * 100)) / 10;
                    int j3 = i % 10;
                    if (i == j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 * j3) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                }
                if (sum == 0) {
                    System.out.println("no");
                }
//			System.out.println("水仙花数的和为:sum=" + sum);
            }
        }
    }
}
