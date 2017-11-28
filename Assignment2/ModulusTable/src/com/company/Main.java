package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        modulusTable mod = new modulusTable(12,n);
        System.out.println("   1   2   3   4   5   6   7   8   9   10   11   12" );

        for (int i = 1; i<=12; i++) {
            System.out.print(i + "  ");
            for (int j = 1; j <= 12; j++) {
                System.out.print(mod.toString(j, n, i)+"  ");

            }
            System.out.print("\n");
        }

    }

}