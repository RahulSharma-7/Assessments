
//7. WAP to convert seconds into days, hours, minutes and seconds.

import java.util.Scanner;

public class Solution7 {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

                System.out.println("Enter the number of Seconds");
        int sec=0,hrs=0,mins=0,days=0;
                 sec = sc.nextInt();
                sc.nextLine();
                 mins = sec/60;
                if(sec>=60){
                    mins=sec/60;
                    sec = sec%60;
                }
                if(mins>=60){
                    hrs=mins/60;
                    mins=mins%60;
                }
                if(hrs>=24){
                    days=hrs/24;
                    hrs=hrs%24;
                }

System.out.println(days+" Days  "+hrs+" hrs "+mins+" mins "+sec+" sec ");
    }
}
