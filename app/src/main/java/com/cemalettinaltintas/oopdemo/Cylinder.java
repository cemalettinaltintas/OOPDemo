package com.cemalettinaltintas.oopdemo;

public class Cylinder extends Object3D{
    private double yaricap;
    private double yukseklik;

    public Cylinder(double yaricap, double yukseklik) {
        this.yaricap = yaricap;
        this.yukseklik = yukseklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    @Override
    public double getArea() {
        return 2*Math.PI*yaricap+2*Math.PI*yaricap*yukseklik;
    }

    @Override
    public double getVolume() {
        return Math.PI*yaricap*yaricap*yukseklik;
    }
}
