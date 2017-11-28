package com.company;

public class modulusTable {

    private int number,modulus;

    public modulusTable(int number, int modulus) {
        this.number = number;
        this.modulus = modulus;
    }

    //@Override
    public String toString(int i, int z, int j) {

        return ""+(i*j)%z;
    }
}
