package com.company;
import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class SemaphoreImplement implements Runnable{
  static int count=0;
Semaphore sem = new Semaphore(2);
    @Override
    public void run() {
synchronized (this){

    try
    {
        Thread.sleep(2000);
        sem.acquire();
    }
    catch (InterruptedException e){
        e.printStackTrace();
    }


    count++;
    System.out.println("Hello :"+count+" Available semaphores "+sem.availablePermits());




    sem.release();
}
    }
}






public class Sol8Semaphore{
    public static void main(String args[]){


        ExecutorService exec = Executors.newFixedThreadPool(5);

        for (int i=0;i<10;i++)
        exec.submit(new SemaphoreImplement());


        exec.shutdown();



    }

}
