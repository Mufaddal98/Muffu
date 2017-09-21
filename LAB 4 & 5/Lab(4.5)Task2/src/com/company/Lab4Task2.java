package com.company;

public class Lab4Task2 {

    public static void main(String[] args) {

        Queue qu1 = new Queue(5); //First Constructor Called

        Queue qu2 = new Queue(qu1); //Second Constructor Called

        char[] ch = {'b','c','d','e','b'};

        Queue qu3 = new Queue(qu1,ch); //Third Constructor Called
    }

}