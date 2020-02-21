package com.company;

/////Using Thread Class

class extendThread extends Thread{

    public void run(){

        for(int i=0;i<10;i++){
            System.out.println("Hello From class Which extends Thread class");
            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }


        }
    }
}


class implementRunnable implements Runnable{

    public void run(){

        for(int i =0;i<10;i++){

            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Hello from the class which extends Runnable class");
        }
    }

}

public class Sol2_Thread_Runnable {

public static void main(String args[])
{
    extendThread t1 = new extendThread();
    implementRunnable runnable = new implementRunnable();
    Thread t2 = new Thread(runnable);

    t1.start();

    t2.start();

    try
    {

        t1.join();
        t2.join();
    }
    catch (InterruptedException e){
        e.printStackTrace();
    }

}
}
