package com.cwp.面向对象;


public class _21接口interface {
    /**
     * 接口（interface）  是与类并行的一个概念
     * 1.接口可以看做是一个特殊的抽象类。是常量与抽象方法的一个集合，不能包含变量、一般的方法。
     * 2.接口是没有构造器的。
     * 3.接口定义的就是一种功能。此功能可以被类所实现（implements）。
     * 比如：class CC extends DD implements AA
     * 4.实现接口的类，必须要重写其中的所有的抽象方法，方可实例化。若没有重写所有的抽象方法，则此类仍为一个抽象类
     * 5.类可以实现多个接口。----java 中的类的继承是单继承的
     * 6.接口与接口之间也是继承的关系，而且可以实现多继承
     * >5,6描述的是java中的继承的特点。
     *
     * @param args
     */
    public static void main(String[] args) {
        Xxxx x = new Xxxx();
        x.eat();
        x.sleep();
    }
}

interface InterfaceXxx {
    //常量:所有的常量都用public static final修饰
    int I = 10;

    //抽象方法:所有的都用public abstract修饰
    void eat();
}

abstract class AbstractXxx implements InterfaceXxx {
    public void sleep() {
        System.out.println("Xxx类中的sleep()方法");
    }
}

class Xxxx extends AbstractXxx implements InterfaceXxx {

    @Override
    public void eat() {
        System.out.println("Xxxx类对接口Interface中eat()方法的重写");
    }
}
