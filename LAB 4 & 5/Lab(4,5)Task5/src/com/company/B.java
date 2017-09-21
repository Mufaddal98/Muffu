package com.company;


public class B extends A {


    public B(){
        super();
        System.out.println("Constructing B ");

    }

}

class A {
    private final int i;
    public A(){
        i=0;
        System.out.println("Constructing A");
    }
    public A(int i){
        this.i=i;
        System.out.println("Constructing A");
    }
}

class C extends B {
    public C() {
        super();
        System.out.println("Constructing C");
    }
}

