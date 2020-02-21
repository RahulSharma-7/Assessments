package com.company;


import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class AddingOddEvenNos implements Runnable {


    int i;


    public AddingOddEvenNos(int i) {

            this.i = i;

        }


    @Override
    public void run() {


        if (i == 1) {
            for (int j = 0; j <= 10; j += 2) {

                System.out.println(j);
            }
        }

        else {


            for (int k = 1; k <= 10; k+= 2)
            {


                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(k);
            }
        }
    }
}












public class Sol4ThreadPool {

    public static void main(String args[])
    {

        ExecutorService execute = Executors.newFixedThreadPool(2);



            execute.submit(new AddingOddEvenNos(1));

            execute.submit(new AddingOddEvenNos(2));




         execute.shutdown();
        try {
            execute.awaitTermination(1,TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The Thread Pool is completed");


    }
}
