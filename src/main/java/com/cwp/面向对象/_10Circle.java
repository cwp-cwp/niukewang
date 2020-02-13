package com.cwp.面向对象;

public class _10Circle {

    private double banJing;

    public _10Circle(double banJing) {
        super();
        this.banJing = banJing;
    }

    public double getBanJing() {
        return banJing;
    }

    public void setBanJing(double banJing) {
        this.banJing = banJing;
    }

    public double getArea() {
        return Math.PI * banJing * banJing;

    }
}
