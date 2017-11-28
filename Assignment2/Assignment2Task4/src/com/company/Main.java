package com.company;

import java.util.Scanner;
/*        This is do-while loop to reinitiate a loop until a particuler command is recieved to end the program.
        * It will automatically end when it will recieve command number 3
        * For the rest it will run uninteruptedly without the need of re initiating the program.
        * The main purpose of this program is to output the time taken for each instruction cycle.
        */

public class Main {

    public static void main(String[] args) {
        // write your code here
        CPUTimer cpuTimer;
        Scanner scanner = new Scanner(System.in);
        int in;
        do {
            System.out.println("Enter your instruction number (1, 2 or 3): ");
            in = scanner.nextInt();

            if (in == 1) {
                System.out.println("How many instructions are there in total? ");
                int ic = scanner.nextInt();
                System.out.println("Enter the count of cycle you want");
                double cpi = scanner.nextDouble();
                System.out.println("Enter the Rate(MHZ)");
                double spi = 1 / (scanner.nextDouble() * 1000000);
                cpuTimer = new CPUTimer(ic, cpi, spi);
                cpuTimer.cps = (cpuTimer.ic * cpuTimer.cpi * cpuTimer.spi);
                System.out.println("The total time required is: " + cpuTimer.cps + " Seconds");
            } else if (in == 2) {
                System.out.println("What will be your instruction number");
                int ic = scanner.nextInt();
                System.out.println("How many seconds does one instruction take? ");
                double spi = scanner.nextDouble();
                cpuTimer = new CPUTimer(ic, spi);
                cpuTimer.cps = (cpuTimer.spi * cpuTimer.ic);
                System.out.println("The total time required is: " + cpuTimer.cps + " Seconds");
            } else {

            }

        }
        while (in != 3);
        System.out.println("You have exitted! ");
    }
}

