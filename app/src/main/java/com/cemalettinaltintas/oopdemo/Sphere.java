package com.cemalettinaltintas.oopdemo;

public class Sphere extends Object3D{
    private double yaricap;
    public Sphere(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*yaricap*yaricap;
    }

    @Override
    public double getVolume() {
        return 4/3*Math.PI*yaricap*yaricap*yaricap;
    }
}
