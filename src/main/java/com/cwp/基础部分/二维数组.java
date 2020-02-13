package com.cwp.基础部分;

import org.junit.Test;

public class 二维数组 {

    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < a.length; i++) { //遍历行数
            for (int j = 0; j < a[i].length; j++) { //遍历列数
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
