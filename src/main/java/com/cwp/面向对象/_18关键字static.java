package com.cwp.面向对象;

public class _18关键字static {
    /**
     * static,静态的，可以用来属性、方法、*代码块（或初始化块）、*内部类
     * <p>
     * static修饰属性（类变量）:
     * 1.由类创建的所有的对象，都共用这一个属性
     * 2.当其中一个对象对此属性进行修改，会导致其他对象对此属性的一个调用。vs 实例变量（非static修饰的属性，各个对象各自拥有一套副本）
     * 3.类变量随着类的加载而加载的，而且独一份
     * 4.静态的变量可以直接通过“类.类变量”的形式来调用
     * 5.类变量的加载是要早于对象。所以当有对象以后，可以“对象.类变量”使用。但是"类.实例变量"是不行的。
     * 6.类变量存在于静态域中。
     * <p>
     * static修饰方法（类方法）:
     * 1.随着类的加载而加载，在内存中也是独一份
     * 2.可以直接通过“类.类方法”的方式调用
     * 3.内部可以调用静态的属性或静态的方法，而不能调用非静态的属性或方法。反之，非静态的方法是可以调用静态的属性或静态的方法
     * >静态的方法内是不可以有this或super关键字的！
     * 注：静态的结构(static的属性、方法、代码块、内部类)的生命周期要早于非静态的结构，同时被回收也要晚于非静态的结构
     *
     * @param args
     */
    //static的一个应用:使用静态的变量可以实现“累加”的效果。因为静态的变量在内存中独一份！
    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(12.5);
        Circle2 circle22 = new Circle2(15.5);
        int total = Circle2.getTotal();
        System.out.println(total); // 2

        Circle2.show();
        Circle2.setInfo("我是一个圆^_^");
        Circle2.show();
    }
}

class Circle2 {
    private double radius;//半径
    private static String info = "我是一个圆";
    private static int total = 0;//因为total是static的，在内存中独一份，所以可以用来记录创建的对象的个数

    public Circle2(double radius) {
        super();
        this.radius = radius;
        total++;
    }

    public Circle2() {
        super();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static String getInfo() {
        return info;
    }

    public static void setInfo(String info) {
        Circle2.info = info;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Circle2.total = total;
    }

    public static void show() {
        System.out.println(info);
    }

    @Override
    public String toString() {
        return "Circle2 [radius=" + radius + "]";
    }

}
