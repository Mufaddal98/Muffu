package com.company;


import java.io.IOException;
import java.util.Scanner;

public class SlotMachine {

    public static final int INITIAL_CREDITS = 10; // a "constant" for the amount of credit a slot machines gives the user to start off

    // INSTANCE PROPERTIES HERE
    Dial[] dials = new Dial[3];;
    int credit;

    //  Constructor initializes the machine with 10 credits.
    public SlotMachine() {
        // initialize instance properties
        credit = INITIAL_CREDITS;
        for (int i = 0; i < 3; i++) {
            dials[i] = new Dial();
        }
    }

    // INSTANCE METHODS HERE
    public int getBet() {

        Scanner scanner = new Scanner(System.in);

        // prompt the user for a bet and save the input to a variable
        System.out.println("Please enter a bet amount (or a negative number to quit): ");
        String stringBet = scanner.next();

        // convert the String to the int value
        int intBet = Integer.parseInt(stringBet);

        return intBet;
    }

    public static void main(String[] args) throws IOException {
        double start = System.currentTimeMillis();
        // declare a variable and assign it a new instance of a SlotMachine
        SlotMachine mySlot = new SlotMachine();

        int bet; // for the current bet value from the user

        // Welcome message
        System.out.println("Welcome to the Slot Machine!!!\nYou have " + mySlot.credit + " credits.\n");

        //ADD CODE to call the getBet method on mySlot
        bet = mySlot.getBet();

        mySlot.pullLever();
//        mySlot.readSlot();
        System.out.println(mySlot.readSlot());
        bet = mySlot.computeWinnings(bet);

        System.out.println("Remaing credits: " + bet);
        double end = System.currentTimeMillis();
        System.out.println("The total time taken is: "+ (end - start)+" Milliseconds");

    }

    public void pullLever() {
        for (int i = 0; i < 3; i++) {
            dials[i].spin();
        }
    }
    //Reading all the three symbols to find out how many of them are the same (if any).
    public String readSlot() {
        String picur = "";
        for (int i = 0; i < 3; i++) {
            picur = picur + dials[i].getPicture();
        }
        return picur;
    }
    //Assigning conditions where the user either wins or loses
    public int computeWinnings(int bet) {
        if (dials[0].getValue() == dials[1].getValue() && dials[0].getValue() == dials[2].getValue() && dials[1].getValue() == dials[2].getValue()) {
            System.out.println("You Won!");
            return bet;
        } else if (dials[0].getValue() == dials[1].getValue() || dials[0].getValue() == dials[2].getValue() || dials[1].getValue() == dials[2].getValue()) {
            System.out.println("You neither won nor lost.");
            return 0;
        } else {
            System.out.println("You lost!");
            return INITIAL_CREDITS - bet;
        }
    }

}