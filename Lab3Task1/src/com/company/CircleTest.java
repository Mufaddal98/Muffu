package com.company;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float r = scanner.nextFloat();
        Circle c = new Circle(r);
        System.out.println("Enter your desired output:  'A' for area    'C' for circumference    'D' for diameter: ");
        String req = scanner.next();

        double area = c.getArea();
        double circumference = (2*3.14159265*r);
        double diameter = 2*r;

        if(req.equalsIgnoreCase(("A")))
            System.out.println("The area of the circle with radius "+r+" is "+area);

        else if(req.equalsIgnoreCase("C"))
            System.out.println("The circumference of the circle with radius "+r+" is "+circumference);

        else if(req.equalsIgnoreCase("D"))
            System.out.println("The diameter of the circle with radius "+r+" is "+diameter);
        else
            System.out.println("You did not enter a valid Letter");

    }
}
