package com.company;

public class Author {
    private String Name,email;
    public Author(String x,String y){
        this.Name=x;
        this.email=y;
    }

    public String getName() {
        return Name;
    }


    public String getEmail() {
        return email;
    }



    public String toString() {
        return "\n Author name: "+getName()+" \n Author's Email: "+getEmail()+" ]";
    }
}
