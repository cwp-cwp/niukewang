package com.cwp.面向对象;

public class _06可变个数形参 {
    /**
     * 可变个数的形参的方法： 1.格式：对于方法的形参： 数据类型 ... 形参名 2.可变个数的形参的方法与同名的方法之间构成重载
     * 3.可变个数的形参在调用时，个数从0开始，到无穷多个都可以。 4.使用可变多个形参的方法与方法的形参使用数组是一致的。
     * 5.若方法中存在可变个数的形参，那么一定要声明在方法形参的最后。 6.在一个方法中，最多声明一个可变个数的形参。
     *
     * @param args
     */
    public static void main(String[] args) {
        _06可变个数形参 s = new _06可变个数形参();
        s.sayHello("中国梦！", "世界和平！", "人工智能！");
        s.sayHello(5, "学习Java", "python", "javaScript", "MySQL");
        System.out.println();
        double sum = s.getSum(12.5, 48.6, 987.695, 4889.58);
        System.out.println(sum);
    }

    // 如下四个方法构成重载
    // 在类中一旦定义了重载的可变个数的形参的方法以后，如下的两个方法可以省略
    // public void sayHello(){
    // System.out.println("hello world!");
    // }
    // public void sayHello(String str1){
    // System.out.println("hello " + str1);
    // }
    public void sayHello(String... str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    public void sayHello(int n, String... str) {
        System.out.println(n);
        for (int j = 0; j < str.length; j++) {
            System.out.print(str[j] + " ");
        }
    }

    // 可变个数形参的使用的例子
    // public int getSum(int i,int j){
    // return i + j;
    // }
    // public int getSum(int i,int j,int k){
    // return i + j + k;
    // }
    public double getSum(double... d) {
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        return sum;

    }

}
