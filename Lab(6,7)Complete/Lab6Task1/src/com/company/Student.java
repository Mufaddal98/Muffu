package com.company;
import javax.naming.Name;

public class Student {

    private String name;
    private int testscore;
    private String grade;

    public Student(String N,int S){
        this.name=N;
        this.testscore=S;
    }
    public void setName(String x){
        name=x;

    }

    public String getName(){
        return name;
    }

    public void setTestscore(int S){
        testscore=S;
    }

    public String getGrade(){

        return grade;
    }
    public void setGrade(String x) {
        grade=x;
    }

    public void CGrade(UndergraduateStudent c){

        if(this.testscore>70||this.testscore==70){

            this.setGrade("Pass");

        }

        else
            this.setGrade("Fail");
    }
}
