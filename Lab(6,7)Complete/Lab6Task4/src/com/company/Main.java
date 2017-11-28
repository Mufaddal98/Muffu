package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point P=new Point(0,0);
        Point P1=new Point(0,2);
        Point P2=new Point(0,3);
        P.distance(P1);
        P.distance(P2);
        P2.distance(P1);
        Triangle T=new Triangle(P,P1,P2);
        System.out.println(T);
        System.out.println("The perimeter of the Triangle is " +T.getPerimeter()+ " and the triangle is "+T.getType());
    }
}
