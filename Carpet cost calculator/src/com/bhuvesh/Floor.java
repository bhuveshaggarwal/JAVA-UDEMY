package com.bhuvesh;

public class Floor {
    private double length;
    private double width;

    public Floor(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        double Area = length * width;
        return Area;
    }

}
