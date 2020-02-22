package com.bhuvesh;

public class Point {
    private int x;
    private int y;

    public Point() {
//        this(0,0); (You can also initialize empty fields here)
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double distance(){

        return Math.sqrt((x*2-x) *(x*2-x) + (y*2 - y)*((y*2-y)));

    }
    public double distance(int x1, int y1){

        return Math.sqrt((x-x1) *(x-x1) + (y - y1)*((y-y1)));

    }
    public double distance(Point point){

        return distance(point.x, point.y);
    }
}
