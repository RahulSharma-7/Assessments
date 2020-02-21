package com.company;

class Creator{

    public void Produce() throws InterruptedException
    {
        synchronized (this)
        {
        System.out.println("Message from Produce:: Hello from Producer");
         System.out.println("Message from Produce::Going to sleep");
         wait();
         System.out.println("Message from Produce::Woke up from Sleep");

    }}

    public void Consume() throws InterruptedException
    {
        synchronized (this) {
            Thread.sleep(1000);
        System.out.println("Message from Consume::Hello from the Consume");
        System.out.println("Message from Consume::Going to wake produce from sleep");
        notify();
        System.out.println("Message from Consume::Notified Produce to wake up");

    }
    }

}

public class Sol5WaitNotify {

public static void main(String args[]){

    Creator create = new Creator();
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                create.Produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                create.Consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    t1.start();
    t2.start();

    try {
        t2.join();
        t1.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}

}
