package com.company;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Sol10DeadLock {

    public static void main(String args[])
    {
                 Lock lock1 = new ReentrantLock();
        Account acc1 = new Account();
        Account acc2 = new Account();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                    lock1.lock();


                        acc1.transfer( acc1,acc2,200);

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
lock1.lock();


    acc2.transfer(acc2,acc1,100);


    lock1.unlock();
}



        });


        t1.start();
        t2.start();


        try
        {

            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }






        System.out.println("THe Balance in First Account is  "+acc1.queryBalance());
        System.out.println("THe Balance in Second Account is  "+acc2.queryBalance());

    }
}


class Account
{
    private  int balance=10000;


    public void deposit(int amount)
    {
         balance+=amount;
    }
    public void withdraw(int amount)
    {
        balance-=amount;
    }
    public int queryBalance()
    {
        return balance;

    }
    public static void transfer(Account acc1,Account acc2,int amount){
        acc1.withdraw(amount);
        acc2.deposit(amount);
    }

}