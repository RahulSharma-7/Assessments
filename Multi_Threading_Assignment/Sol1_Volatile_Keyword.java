package com.company;

class A extends Thread{
        private int i;
        private static volatile  int count=0;

        public A(int n)
        {
            this.i=n;
        }

    public void run()
    {

        for(int j=0;j<10;j++) {
            count++;

        }



        System.out.println("From thread " + i + " Count equals :"+count);

    }
}

public class Sol1_Volatile_Keyword {
    public static void main(String args[]){

        A a = new A(1);
        A b= new A(2);
        a.start();
        b.start();


    }
}
