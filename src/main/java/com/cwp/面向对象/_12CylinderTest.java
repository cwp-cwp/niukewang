package com.cwp.面向对象;

public class _12CylinderTest {

    public static void main(String[] args) {
        _11Cylinder c = new _11Cylinder(12.5, 23.6);
        double area = c.getArea();
        System.out.println(area);
        c.setBanJing(10.45);
        double area2 = c.getArea();
        System.out.println(area2);
    }

}
