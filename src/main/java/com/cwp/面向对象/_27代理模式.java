package com.cwp.面向对象;

/**
 * 接口的应用：代理模式
 *
 * @author 叔公
 */
public class _27代理模式 {

    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject();
        proxyObject.action();
    }
}

interface MyObject {
    void action();
}

// 代理类
class ProxyObject implements MyObject {
    MyObject obj;

    public ProxyObject() {
        super();
        obj = new ObjctImpl();
    }

    @Override
    public void action() {
        System.out.println("代理类开始执行代理");
        obj.action();
        System.out.println("代理类执行代理完毕");
    }

}

// 被代理类
class ObjctImpl implements MyObject {

    @Override
    public void action() {
        System.out.println("被代理类开始被执行");
        System.out.println("被代理类执行中");
        System.out.println("被代理类下执行完毕");
    }

}