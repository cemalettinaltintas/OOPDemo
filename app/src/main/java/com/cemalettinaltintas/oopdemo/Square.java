package com.cemalettinaltintas.oopdemo;

public class Square extends Object2D{

    private double kenar;
    public Square(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double getArea() {
        return kenar*kenar;
    }

}
