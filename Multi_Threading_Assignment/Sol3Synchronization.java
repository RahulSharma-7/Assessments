package com.company;


import java.util.ArrayList;
import java.util.List;

 class AddingNumbers
{
     int i = 1;
     int j=1;
     int k=1;

    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list1 = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    public synchronized void addNo(){                   //Using Synchronised method
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        list.add(i++);

    }
    private  Object lock1 = new Object();
    public void increment(){                                    //Using Synchronised block

    synchronized (lock1)
    {
        list1.add(j++);
    }
    }

        public void increase(){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        list2.add(k++);
        }




}


public class Sol3Synchronization {

public static void main(String args[])
{
    AddingNumbers addnum = new AddingNumbers();

    Thread even_no = new Thread(new Runnable(){
        @Override
        public void run() {
            for(int i=0;i<10;i++)
            addnum.addNo();
        }
    });
    Thread odd_no = new Thread(new Runnable(){
        @Override
        public void run() {
        for (int i=0;i<10;i++)
            addnum.addNo();
        }
    });
    even_no.start();
    odd_no.start();

    try
    {
        even_no.join();
        odd_no.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("The List of Numbers using Synchronised method is "+addnum.list);



                    /////////////Using synchronised blocks with lock


    Thread even_no1 = new Thread(new Runnable(){
        @Override
        public void run() {
            for(int i=0;i<10;i++)
                addnum.increment();
        }
    });
    Thread odd_no1 = new Thread(new Runnable(){
        @Override
        public void run() {
            for (int i=0;i<10;i++)
                addnum.increment();
        }
    });
    even_no1.start();
    odd_no1.start();

    try
    {
        even_no1.join();
        odd_no1.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }


                        //without using any synchronised blocks / methods
    System.out.println("The List of Numbers using Synchronised method is "+addnum.list1);


    Thread even_no2 = new Thread(new Runnable(){
        @Override
        public void run() {
            for(int i=0;i<10;i++)
                addnum.increase();
        }
    });
    Thread odd_no2 = new Thread(new Runnable(){
        @Override
        public void run() {
            for (int i=0;i<10;i++)
                addnum.increase();
        }
    });
    even_no2.start();
    odd_no2.start();

    try
    {
        even_no2.join();
        odd_no2.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }




    System.out.println("The List of Numbers without using any synchronisation is "+addnum.list2);

}
}
