package com.company;


import java.util.*;
import java.util.concurrent.*;




class AddingNumber implements Callable<List> {


    int i;
    List<Integer> array = new ArrayList<Integer>();


    public AddingNumber(int i) {

        this.i = i;

    }


    @Override
    public List call() {


        if (i == 1) {
            for (int j = 0; j <= 10; j += 2) {

                array.add(j);
            }
            return array;
        }

        else {


            for (int k = 1; k <= 10; k+= 2)
            {


                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                array.add(k);
            }
            return array;
        }
    }
}












public class Sol7Callable {

    public static void main(String args[]) {

        ExecutorService execute = Executors.newFixedThreadPool(2);


        Future<List> fut
                =  execute.submit(new AddingNumber(1));

        Future<List> fut2 =  execute.submit(new AddingNumber(2));


        execute.shutdown();
        try {
            execute.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();


        }




        try
        {
            System.out.println("The List is "+fut.get());
            System.out.println("The List is "+fut2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
