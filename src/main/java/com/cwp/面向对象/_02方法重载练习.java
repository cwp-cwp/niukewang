package com.cwp.面向对象;

public class _02方法重载练习 {
    /**
     * 题目一： 编写程序，定义三个重载方法并调用。方法名为mOL。
     * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
     * 分别执行平方运算并输出结果， 相乘并输出结果，输出字符串信息。
     * 在主类的main()方法中分别用参数区别调用三个方法。
     * <p>
     * 题目二： 定义三个重载方法max()，第一个方法求两个int值中的最大值，
     * 第二个方法求两个double值中的最大值， 第三个方法求三个double值中的最大值，并分别调用三个方法。
     *
     * @param args
     */
    public static void main(String[] args) {
        _02方法重载练习 m = new _02方法重载练习();
        m.mOL(15);
        m.mOL(15, 45);
        m.mOL("中国梦！");

        System.out.println(m.max(45, 98));
        System.out.println(m.max(45.89, 18.45));
        System.out.println(m.max(78.9, 98.85, 78.59));
    }

    /*
     * 以下三个方法构成重载
     */
    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String str) {
        System.out.println(str);
    }

    /*
     * 以下三个方法构成重载
     */
    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j, double k) {
        return (max(i, j) > k) ? max(i, j) : k;
    }
}
