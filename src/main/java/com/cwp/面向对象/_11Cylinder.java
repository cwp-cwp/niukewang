package com.cwp.面向对象;


public class _11Cylinder extends _10Circle {

    public _11Cylinder(double banJing) {
        super(banJing);
    }

    private double length;

    public _11Cylinder(double banJing, double length) {
        super(banJing);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + 2 * Math.PI * this.getBanJing() * this.getLength();
    }

}
