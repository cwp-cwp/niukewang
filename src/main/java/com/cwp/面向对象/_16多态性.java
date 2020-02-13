package com.cwp.面向对象;

public class _16多态性 {
    /**
     * 面向对象的特征三：多态性
     * 1.多态性指的是什么？多态性，可以理解为一个事物的多种表型形态。
     * 1）方法的重载与重写  2）子类对象的多态性
     * <p>
     * 2.子类对象的多态性使用的前提：①要有类的继承②要有子类对父类方法的重写
     * <p>
     * 3.程序运行分为编译状态和运行状态。
     * 对于多态性来说，编译时，"看左边"，将此引用变量理解为父类的类型
     * 运行时，"看右边",关注于真正对象的实体：子类的对象。那么执行的方法就是子类重写的。
     * <p>
     * 4.子类对象的多态性，并不使用于属性。
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person1 person1 = new Person1();
        person1.eat();
        person1.sleep();

        Man man = new Man();
        man.eat();
        man.sleep();
        man.show();//这是 Person1 类的方法！

        // 子类对象的多态性：父类的引用指向子类对象
        Person1 p1 = new Man();// 向上转型
        // 虚拟方法调用：通过父类的引用指向子类的对象实体，当调用方法时，实际执行的是子类重写父类的方法
        p1.eat(); //男人吃饭！
        p1.sleep();//男人睡觉！
        p1.show();//这是 Person1 类的方法！

        Person1 p2 = new Women();
        Women w = (Women) p2;// 向下转型,使用强转符：()
        w.eat();//女人吃饭！
        w.sleep();//女人睡觉！

        //出异常  java.lang.ClassCastException
//		Man m = (Man) p2;
//		m.eat();
//		m.sleep();

        // instanceof:
        // 格式： 对象a instanceof 类A：判断对象a是否是类A的一个实例.是的话，返回true；否则返回false
        // 若a是A类的实例，那么a也一定是A类的父类的实例。
        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            m2.eat();
        } else if (p2 instanceof Women) {
            Women w2 = (Women) p2;
            w2.eat(); //女人吃饭！
        } else if (p2 instanceof Person1) {
            Person1 person12 = (Person1) p2;
            person12.eat();
        }
    }
}

class Person1 {
    private String name;
    private int age;
    private String id;

    public Person1(String name, int age, String id) {
        super();
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person1() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("人吃饭！");
    }

    public void sleep() {
        System.out.println("人睡觉！");
    }

    public void show() {
        System.out.println("这是 Person1 类的方法！");
    }
}

class Man extends Person1 {
    @Override
    public void eat() {
        //super.eat();
        System.out.println("男人吃饭！");
    }

    @Override
    public void sleep() {
        //super.sleep();
        System.out.println("男人睡觉！");
    }
}

class Women extends Person1 {
    @Override
    public void eat() {
        //super.eat();
        System.out.println("女人吃饭！");
    }

    @Override
    public void sleep() {
        //super.sleep();
        System.out.println("女人睡觉！");
    }
}
