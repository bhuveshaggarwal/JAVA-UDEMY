package com.bhuvesh;

public class AreaCalculator {
    public static double area(double radius){
        if (radius <0){
            return -1.0;
        } else{
            return radius*radius*Math.PI;
        }
    }
    public static double area(double Length, double Breadth){
        if (Length <0 || Breadth <0){
            return -1.0;
        } else {
            return Length*Breadth;
        }
    }
}
