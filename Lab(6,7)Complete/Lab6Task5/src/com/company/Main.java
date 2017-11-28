package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Author A=new Author("Dan Brown","DBrown@hotmail.com");
        Book B=new Book("Inferno ",1800,A);
        System.out.println(B);
    }
}
