package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        // Taking input from user
        System.out.println("Enter any  number greater than or equal to 0: ");
        int input = scanner.nextInt();
        //Assigning conditions
        if(input<0)
            System.out.println("The number cannot be less than 0");
        int sum=0;
        for (int i=0;i<=input;i++){
            sum = sum+i;
        }
        System.out.println("The sum of all numbers from 0 to "+input+" is: "+sum);
    }
}