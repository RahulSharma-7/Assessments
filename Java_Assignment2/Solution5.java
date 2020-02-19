package com.company;

public class Solution5 {


     int value1;
    int value2;
    int value3;

    public Solution5(int a,int b,int c){
        this.value1=a;
        this.value2=b;
        this.value3=c;
    }
     public Solution5(Solution5 obj){
        this.value1=obj.value1;
        this.value2=obj.value2;
        this.value3=obj.value3;

     }


     public static void main(String args[]){

        Solution5 obj1=new Solution5(10,12,13);
        Solution5 clone=new Solution5(obj1);
            System.out.println("The Values in obj1 are "+obj1.value3+" "+obj1.value2+" "+obj1.value1);
            clone.value1=2;
         System.out.println("The Values in clone are "+obj1.value3+" "+clone.value2+" "+clone.value1);
         System.out.println("The Values in obj1 are "+obj1.value3+" "+obj1.value2+" "+obj1.value1);
     }


}
