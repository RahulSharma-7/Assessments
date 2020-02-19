package com.company;

public class Solution4 {

        public static Solution4 single_instance;
        public static String str;
        public static int a;
        private Solution4(){

            str="Hello from Singleton Class";
            a=2;
        }

        public static Solution4 getInstance(){

            if(single_instance==null){
                single_instance=new Solution4();

            }

            return single_instance;
        }


        public static  void main(String args[]){


            Solution4 sol=Solution4.getInstance();
            System.out.println(sol.str);

        }
}


