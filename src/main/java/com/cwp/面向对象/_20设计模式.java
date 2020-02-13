package com.cwp.面向对象;

public class _20设计模式 {
    /**
     * 设计模式：设计模式是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式。
     * 23种设计模式。
     * <p>
     * 单例的设计模式：
     * 1.解决的问题：使得一个类只能够创建一个对象。
     * 2.如何实现？见如下的4步
     *
     * @param args
     */
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2); // true : 只创建了一个实例

        Singleton2 singleton22 = Singleton2.getInstance();
        Singleton2 singleton23 = Singleton2.getInstance();
        System.out.println(singleton22 == singleton23); // true : 只创建了一个实例
    }
}

/*
 * 只能创建Singleton的单个实例
 */

/**
 * 饿汉式
 */
class Singleton {
    //1.私有化构造器，使得在类的外部不能够调用此构造器
    private Singleton() {

    }

    //2.在类的内部创建一个类的实例
    //3.私有化此对象，通过公共的方法来调用
    private static Singleton instance = new Singleton();

    //4.此公共的方法，只能通过类来调用，因为设置为static的,
    //同时类的实例也必须为static声明的
    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * 懒汉式:可能存在线程安全问题的
 */
class Singleton2 {
    private Singleton2() {

    }

    private static Singleton2 instance = null;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;

    }
}
