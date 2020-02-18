public class Solution1 {

    public static void main(String args[]){

                String str = new String("This is the original string");

                String st="tempered";


                System.out.println("The substring is "+str.indexOf('o'));


              String substr = str.substring(12,20);
              System.out.println(substr);

              String tempstr =str.replace(substr,st);
              System.out.println("The string after change is "+ tempstr);


    }


}
