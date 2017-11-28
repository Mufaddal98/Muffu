package com.company;

public class Book {
    private String title;
    private Author ath;
    private double price;

    public Book(String T,double P,Author at){
        this.title=T;
        this.price=P;
        this.ath=at;
    }

    public String getTitle() {
        return title;
    }

    public Author getAth() {
        return ath;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return " Book name: "+getTitle()+" \n Price: "+getPrice()+" "+getAth()+" ]";
    }
}
