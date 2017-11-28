package com.company;

public class SalariedEmployee extends Employee{

    private double WSalary,r;


    public SalariedEmployee(String x, String y, Double z){
        super(x,y);
        this.WSalary=z;

    }


    public double Earnings(double WSalary,int y){
        WSalary=WSalary*52;
        return WSalary;
    }
    public double getWSalary(){
        return WSalary;
    }

    public void Displaydetails(SalariedEmployee c){
        System.out.println(" Name "+this.getName()+" NIC "+this.getNIC()+"Earnings "+this.getWSalary());

    }
}
