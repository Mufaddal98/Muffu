package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number greater than or equal to 0: ");
        int input = scanner.nextInt();
        int fact=1;

        for (int i=1; i<=input;i++){
            fact = fact*i;
        }
        System.out.println("The Factorial of your number is: "+fact);
    }
}