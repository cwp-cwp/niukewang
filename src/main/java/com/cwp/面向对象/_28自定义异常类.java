package com.cwp.面向对象;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

/**
 * 如何自定义一个异常类
 * 1.自定义的异常类继承现有的异常类
 * 2.提供一个序列号，提供几个重载的构造器
 * <p>
 * 子类重写的父类的方法，其抛出的异常类型只能是被重写的方法的异常类的子类或异常类型一样。
 * <p>
 * 异常处理的方式二：在方法的声明处，显式的抛出该异常对象的类型
 * 格式：如：public static  void method2() throws FileNotFoundException,IOException{}
 * 当在此方法内部出现异常的时候，会抛出一个异常类的对象，抛给方法的调用者。
 * 异常的对象可以逐层向上抛，直至main中。当然在向上抛的过程中，可以再通过try-catch-finally进行处理。
 * <p>
 * java的异常处理：抓抛模型
 * 1.抓：异常的处理，有两种方式(①try-catch-finally② throws + 异常的类型)
 * 2.抛：一旦执行过程中，出现异常，会抛出一个异常类的对象。（自动的抛出  vs 手动的抛出（throw + 异常类的对象））
 * >异常类，既可以是现成的异常类，也可以是自己创建的异常类
 *
 */
public class _28自定义异常类 {

    public static void main(String[] args) {
        Yuan y1 = new Yuan(12.5);
        Yuan y2 = new Yuan(13.5);
        try {
            y1.compareTo(y2);
            y1.compareTo(y1);
            y1.compareTo(new String("AA"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTestException() {
        try {
            TestException.method1();
        } catch (IOException e) {
            System.out.println(e.getMessage());//打印出错误信息
            e.printStackTrace();
        }
    }

}

/*
 * 自定义异常类
 */
class MyException extends Exception {

    private static final long serialVersionUID = -8008751107479144523L;

    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }
}

/*
 * 手动的抛出一个异常的例子
 * 抛出的异常类型：若是RuntimeException，可以不显式的处理
 * 若是一个Exception,必须要显式的处理。
 */
class Yuan {
    private double banJing;

    public Yuan(double banJing) {
        super();
        this.banJing = banJing;
    }

    public Yuan() {
        super();
    }

    public double getBanJing() {
        return banJing;
    }

    public void setBanJing(double banJing) {
        this.banJing = banJing;
    }

    // 比较圆的半径大小
    public void compareTo(Object obj) throws Exception {
        if (this == obj) {
            System.out.println("同一个对象");
        } else if (obj instanceof Yuan) {
            Yuan y = (Yuan) obj;
            if (this.banJing == y.banJing) {
                System.out.println("半径相等");
            } else if (this.banJing > y.banJing) {
                System.out.println("当前对象的半径大");
            } else {
                System.out.println("当前对象的半径小");
            }
        } else {
            // 手动抛出一个异常
            // throw new Exception("传入的类型有错误");
            throw new MyException("传入的类型有误");
        }
    }
}

class TestException {
    private TestException() {

    }

    public static void method1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("hello.txt"));
        int b;
        while (((b = fileInputStream.read()) != -1)) {
            System.out.print((char) b);
        }
        fileInputStream.close();
    }

    public static void method2() throws IOException {
        method1();
    }

    public static void method3() {
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

