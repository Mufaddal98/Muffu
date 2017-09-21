package com.company;

public class Queue {


    char q[];
    int getloc, putloc;

    Queue quCopy;

    public Queue(int size) {
        q=new char[size];
        putloc = -1;
    }

    public Queue(Queue qu) {
        quCopy = qu;
    }

    public Queue(Queue qu, char q[]) {
        for (int i = 0; i < q.length; i++) {
            qu.put(q[i]);
        }
    }

    public char get(){
        if(putloc == -1){
            System.out.println("Your array is empty");
            return 0;
        }
        return q[putloc];
    }

    public void put(char c) {
        if(putloc == 9) {
            new QueueException("You have reached the max capacity");

            return;
        }
        q[putloc=putloc+1]=c;
    }
}

class QueueException extends Exception{
    QueueException(String errorMessage){
        super(errorMessage);


    }

}

