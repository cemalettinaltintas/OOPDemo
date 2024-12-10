package com.cemalettinaltintas.oopdemo;

public class Circle extends Object2D{

    private  double yaricap;
    public Circle(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getArea() {
        return Math.PI*yaricap*yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
