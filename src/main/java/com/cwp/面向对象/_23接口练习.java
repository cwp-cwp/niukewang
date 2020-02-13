package com.cwp.面向对象;

public class _23接口练习 {

    public static void main(String[] args) {
        Computer computer = new Computer();
        USB usb = new Printer();//多态
        computer.doWork(usb);

        USB usb2 = new Flash();
        computer.doWork(usb2);

        //实现接口的匿名类的对象
        USB usb3 = new USB() {

            @Override
            public void start() {
                System.out.println("匿名类对象usb3开始开始工作！");
            }

            @Override
            public void end() {
                System.out.println("匿名类对象usb3 结束工作！");
            }
        };
        computer.doWork(usb3);

        //实现接口的匿名类的匿名对象
        computer.doWork(new USB() {

            @Override
            public void start() {
                System.out.println("匿名类匿名对象xxx开始工作！");
            }

            @Override
            public void end() {
                System.out.println("匿名类匿名对象xxx结束工作！");
            }
        });

    }

}

interface USB {
    void start();

    void end();
}

//打印机
class Printer implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作！");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作！");
    }
}

// U盘
class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开始工作！");
    }

    @Override
    public void end() {
        System.out.println("U盘结束工作！");
    }
}

//电脑
class Computer {
    public void doWork(USB usb) {
        usb.start();
        usb.end();
    }
}
