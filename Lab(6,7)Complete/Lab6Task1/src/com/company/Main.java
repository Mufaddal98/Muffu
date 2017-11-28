package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        UndergraduateStudent [] UG=new UndergraduateStudent[5];


        UG[0]=new UndergraduateStudent("Adam",50);
        UG[1]=new UndergraduateStudent("Haro",99);
        UG[2]=new UndergraduateStudent("Dave",91);
        UG[3]=new UndergraduateStudent("Samo",77);
        UG[4]=new UndergraduateStudent("Nova",62);


        System.out.println("Names          "+"Grade \n");
        for (int i=0;i<5;i++){
            UG[i].CGrade(UG[i]);
            System.out.println(UG[i].getName()+"            "+UG[i].getGrade());
        }
    }
}
