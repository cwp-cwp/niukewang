package com.cwp.面向对象;

public class _13抽象类abstract {
    /**
     * abstract:抽象的,可以用来修饰类、方法
     * <p>
     * 1.abstract修饰类：抽象类
     * 1)不可被实例化
     * 2)抽象类有构造器 (凡是类都有构造器)
     * 3)抽象方法所在的类，一定是抽象类。
     * 4)抽象类中可以没有抽象方法。
     * <p>
     * 2.abstract修饰方法：抽象方法
     * 1)格式：没有方法体，包括{}.如：public abstract void eat();
     * 2)抽象方法只保留方法的功能，而具体的执行，交给继承抽象类的子类，由子类重写此抽象方法。
     * 3)若子类继承抽象类，并重写了所有的抽象方法，则此类是一个"实体类",即可以实例化
     * 4)若子类继承抽象类，没有重写所有的抽象方法，意味着此类中仍有抽象方法，则此类必须声明为抽象的！
     * <p>
     * abstract 不能用来修饰属性、构造器、private、final、static
     * 因为构造器不能被重写,子类不能覆盖（或重写）声明为private的方法的。
     *
     * @param args
     */
    public static void main(String[] args) {
        AbstractClass1 abstractClass1 = new AbstractClass1();
        abstractClass1.sleep();
        abstractClass1.eat();

        AbstractClass3 abstractClass3 = new AbstractClass3();
        abstractClass3.show();
        abstractClass3.sleep();
        abstractClass3.eat();
        abstractClass3.setName("AbstractClass2 for name");
        System.out.println(abstractClass3.getName());

    }
}

abstract class AbstractClass {
    public void eat() {
        System.out.println("抽象类 AbstractClass 中的非抽象方法 eat()");
    }

    public abstract void sleep();
}

/*
 * 重写父类的抽象方法
 */
class AbstractClass1 extends AbstractClass {

    @Override
    public void sleep() {
        System.out.println("重写父类中抽象方法sleep()");
    }
}

/*
 * 不重写父类的抽象方法，此类必须声明为抽象方法
 */
abstract class AbstractClass2 extends AbstractClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractClass2(String name) {
        super();
        this.name = name;
    }

    public AbstractClass2() {
        super();
    }

    public abstract void show();
}

class AbstractClass3 extends AbstractClass2 {

    @Override
    public void show() {
        System.out.println("重写父类的抽象方法show()");
    }

    @Override
    public void sleep() {
        System.out.println("重写父类的抽象方法sleep()");
    }

}



