package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number greater than 1: ");
        //Declaring a 2d Array
        int[][] table = new int[13][13];
        int n;
        n = in.nextInt();


        //Using nested loops for outlook
        for(int i=1; i <= table.length-1; i++)
        {
            for (int j=1; j <= table[0].length-1; j++)
            {
                table[i][j] = i*j % n;
                if (table[i][j] < 10)
                    System.out.print("  " + table[i][j] + " ");
                else
                if (table[i][j] > 10 && table[i][j] < 100)
                    System.out.print(" " + table[i][j] + " ");
                else
                    System.out.print(table[i][j] + " ");
            }
            System.out.println(" ");
        }



    }

    }