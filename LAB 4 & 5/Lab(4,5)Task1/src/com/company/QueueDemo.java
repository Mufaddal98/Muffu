package com.company;

import java.util.Scanner;

public class QueueDemo {

    Queue qu;

    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        QueueDemo demo = new QueueDemo();
        demo.doWork();
    }

    //    public void doWork() {
//         String choice = "Y";
//
//        while(choice.equals("Y")) {
//
//            System.out.println("Do you");
//
//            System.out.println("Do you want to continue(Y/N)?");
//            String ch = scanner.next();
//            if(ch.equals("N")) {
//                break;
//            }
//        }
//    }
    public void doWork() {
        qu = new Queue(10);
        System.out.println("Enter a character to add to array:  ");
        String i = scanner.next();
        if(i.length() > 1) {
            System.out.println("The value you enetered is not a character");
            System.exit(0);
        } else {
            qu.put(i.charAt(0));
        }

    }

}