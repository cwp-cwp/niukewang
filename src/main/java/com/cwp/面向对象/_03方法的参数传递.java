package com.cwp.面向对象;

import org.junit.Test;

public class _03方法的参数传递 {
    /**
     * 方法的参数传递（重点、难点）
     * 1.形参：方法声明时，方法小括号内的参数
     * 实参：调用方法时，实际传入的参数的值
     * <p>
     * 2.规则：java中的参数传递机制：值传递机制
     * 1）形参是基本数据类型的：将实参的值传递给形参的基本数据类型的变量
     * 2）形参是引用数据类型的：将实参的引用类型变量的值（对应的堆空间的对象实体的首地址值）传递给形参的引用类型变量。
     *
     * @param args
     */
    public static void main(String[] args) {
        _03方法的参数传递 f = new _03方法的参数传递();
        int i = 10;
        int j = 5;
        f.sweap(i, j);

//		//交换变量i与j的值
//		int temp = i;
//		i = j;
//		j = temp;

        System.out.println("i = " + i + " j = " + j); //i = 10 j = 5
    }

    //定义一个方法，交换两个变量的值
    public void sweap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m = " + m + " n = " + n);
    }

    /*
     * *******************************************************************
     */
    public void sweap2(DataSweap ds) {
        int temp = ds.i;
        ds.i = ds.j;
        ds.j = temp;
    }

    @Test
    public void testDataSweap() {
        _03方法的参数传递 f = new _03方法的参数传递();
        DataSweap d = new DataSweap();
        f.sweap2(d);
        System.out.println("i = " + d.i + " j = " + d.j);//i = 5 j = 10
    }
}

class DataSweap {
    int i = 10;
    int j = 5;
}
