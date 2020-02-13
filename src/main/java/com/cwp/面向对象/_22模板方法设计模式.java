package com.cwp.面向对象;

public class _22模板方法设计模式 {

    public static void main(String[] args) {
        SubTemplate s = new SubTemplate();
        s.spendTime();
    }
}

abstract class Template {

    public abstract void code();

    public void spendTime() {
        long start = System.currentTimeMillis();
        this.code();
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("花费时间为: " + time);
    }
}

class SubTemplate extends Template {

    @Override
    public void code() {
        boolean flag = false;
        for (int i = 2; i <= 10000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
            flag = false;
        }
    }

}
