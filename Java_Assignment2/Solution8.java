import java.util.Scanner;

public class Solution8 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
    int len;
        String x="";

            do{
              x = sc.nextLine();
              if(x.equals("done")){
                  break;
              }
              len=x.length();
                if(x.charAt(0)==x.charAt(len-1)){
                    System.out.println("The First and last character are same");
                }
                else
                {
                    System.out.println("The First and the last character are not same");
                }

      }        while(!x.equals("done"));


    }
}
