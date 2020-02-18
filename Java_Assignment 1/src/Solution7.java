
//Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively


public class Solution7 {

public static  String FirstName="";
public static String LasttName;
public static int age;

    public static void main(String args[]){

            Solution7.assign();
            Solution7.print();




    }

    public static  void assign(){         //Assigning the static variables
        FirstName="Rahul";
        LasttName="Sharma";
        age=22;

    }


    public static void print(){
        System.out.println("First name is :"+FirstName);            //Printing the static variabbles using static function;
        System.out.println("Last name is :"+LasttName);
        System.out.println("Age is :"+age);

    }





}
