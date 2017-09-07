package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome");
        /**
         * These are the varaibles that are used in the programs.
         * User shall be asked to input the value for all except time
         */
        int instruction1 =1;
        int instruction2 =2;
        int instruction3 =3;
        int instructionnum;
        int numinstruction;
        double cyclecount;
        double rate;
        double time;
        double seconds;
        System.out.println(" Press '1' for instruction Set 1");
        System.out.println(" Enter '2' for instruction Set 2");
        System.out.println(" Enter '3' to end ");
/**
 * This is do-while loop to reinitiate a loop until a particuler command is recieved to end the program.
 * It will automatically end when it will recieve command number 3
 * For the rest it will run uninteruptedly without the need of re initiating the program.
 */
        do {
            System.out.println("What will be your instruction number");
            instructionnum = in.nextInt();
            if(instructionnum == 1){
                System.out.println("How many instructions are there in total? ");
                numinstruction = in.nextInt();
                System.out.println("Enter the count of cycle you want");
                cyclecount = in.nextDouble();
                System.out.println("Enter the Rate(MHZ)");
                rate = 1/(in.nextDouble()* 1000000);
                time =( numinstruction * cyclecount * rate);
                System.out.println("The total time required is: " + time + " Seconds");
            }
            else if(instructionnum ==2){
                System.out.println("What will be your instruction number");
                numinstruction = in.nextInt();
                System.out.println("How many seconds does one instruction take? ");
                seconds = in.nextDouble();
                time = (seconds * numinstruction);
                System.out.println("The total time required is: " + time + " Seconds");
            }
            else{

            }

        }
        while ( instructionnum != 3);




    }
}