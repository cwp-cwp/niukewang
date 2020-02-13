package com.cwp.面向对象;

/**
 * 接口的应用：工厂方法的设计模式
 *
 * @author 叔公
 */
public class _24工厂方法设置模式 {

    public static void main(String[] args) {
        WorkFactory swf = new StudentWorkFactory();
        swf.getWork().doWork();

        WorkFactory twf = new TeacherWorkFactory();
        twf.getWork().doWork();
    }
}

interface Work {
    void doWork();
}

class StudentWork implements Work {

    @Override
    public void doWork() {
        System.out.println("学生工作！");
    }
}

class TeacherWork implements Work {

    @Override
    public void doWork() {
        System.out.println("老师工作！");
    }
}

interface WorkFactory {
    Work getWork();
}

class StudentWorkFactory implements WorkFactory {

    @Override
    public Work getWork() {
        Work studentWork = new StudentWork();
        return studentWork;
    }
}

class TeacherWorkFactory implements WorkFactory {

    @Override
    public Work getWork() {
        Work teacherWork = new TeacherWork();
        return teacherWork;
    }
}
