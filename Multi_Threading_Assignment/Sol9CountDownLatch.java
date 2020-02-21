package com.company;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Work implements Runnable{

    CountDownLatch latch;
    public Work(CountDownLatch latch)
    {
        this.latch=latch;
    }

    @Override
    public void run() {

        System.out.println("Hello");
        latch.countDown();
        System.out.println(latch);
    }
}






public class Sol9CountDownLatch {
public static void main(String args[]){

    CountDownLatch latch = new CountDownLatch(2);
    ExecutorService exec = Executors.newFixedThreadPool(4);
    exec.submit(new Work(latch));
    exec.submit(new Work(latch));
    exec.submit(new Work(latch));
    exec.submit(new Work(latch));
    exec.submit(new Work(latch));
    exec.submit(new Work(latch));
    exec.submit(new Work(latch));
    exec.submit(new Work(latch));
    try {
        latch.await();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("After Latch");
    exec.shutdown();



}

}
