package com.cwp.面向对象;

public class _19代码块 {
    /**
     * 类的第四个成员：初始化块（或代码块） 1.代码块如果有修饰的话，那么只能使用static。 2.分类： 静态代码块： 1.里面可以有输出语句
     * 2.随着类的加载而加载，而且只被加载一次 3.多个静态代码块之间按照顺序结构执行 4.静态代码块的执行要早于非静态代码块的执行。
     * 5.静态的代码块中只能执行静态的结构(类属性，类方法)
     * <p>
     * 非静态代码块： 1.可以对类的属性(静态的 & 非静态的)进行初始化操作，同时也可以调用本类声明的方法(静态的 & 非静态的)
     * 2.里面可以有输出语句 3.一个类中可以有多个非静态的代码块，多个代码块之间按照顺序结构执行 4.每创建一个类的对象，非静态代码块就加载一次。
     * 5.非静态代码块的执行要早于构造器
     * <p>
     * 关于属性赋值的操作：①默认的初始化②显式的初始化或代码块初始化(此处两个结构按照顺序执行) ③构造器中；④通过方法对对象的相应属性进行修改
     *
     * @param args
     */
    public static void main(String[] args) {
        Order2 order2 = new Order2();
    }
}

class Order2 {
    private String name;
    private int id;
    private static String desc;

    public Order2(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }

    public Order2() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getDesc() {
        return desc;
    }

    public static void setDesc(String desc) {
        Order2.desc = desc;
    }

    @Override
    public String toString() {
        return "Order [name=" + name + ", id=" + id + "]";
    }

    /*
     * 静态代码块 , 执行静态的属性和方法
     */
    static {
        System.out.println("静态代码块！");
        desc = "静态！";
        String d = getDesc();
        System.out.println(d);
        show2();

    }

    /*
     * 非静态代码块 ，对类的 静态和非静态 的 属性和方法 都能执行
     */ {
        System.out.println("非静态代码块！");
        name = "Java";
        id = 1001;
        int id1 = getId();
        String name1 = getName();
        System.out.println(id1);
        System.out.println(name1);
        show1();
        show2();
        desc = "非静态！";
        String desc2 = getDesc();
        System.out.println(desc2);

    }

    public void show1() {
        System.out.println("show1()");
    }

    public static void show2() {
        System.out.println("show2()");
    }
}
