package com.company;

public class Point {

    private int x,y;


    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {

        return y;
    }

    public double distance(Point a){
        double b= Math.sqrt(Math.pow(a.x-x,2)+Math.pow(a.y-y,2));
        return b;

    }


    public String toString() {
        return "("+x+","+y+")";
    }
}
