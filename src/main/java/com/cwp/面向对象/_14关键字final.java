package com.cwp.面向对象;

public class _14关键字final {
    /**
     * * final:最终的 ，可以用来修饰类、属性、方法
     * <p>
     * 1.final修饰类：这个类就不能被继承。如：String类、StringBuffer类、System类
     * <p>
     * 2.final修饰方法：不能被重写。如：Object类的getClass()
     * <p>
     * 3.final修饰属性：此属性就是一个常量，一旦初始化后，不可再被赋值。习惯上，常量用大写字符表示。
     * 此常量在哪里赋值：①此常量不能使用默认初始化 ②可以显式的赋值、代码块、构造器。
     * <p>
     * 变量用static final修饰：全局常量
     * <p>
     * >与finally finalize()区分开
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }
}

class ExerFinal {
    public final int F = 10;
    public static final double D = 12.5;
    private static final String NAME;
    private final int AGE;
    private final String EMAIL;

    {
        EMAIL = "ccc";
    }

    static {
        NAME = "xxx";
    }

    public ExerFinal(int aGE) {
        super();
        AGE = aGE;
    }

}
