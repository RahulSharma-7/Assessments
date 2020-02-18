


/* Q8. Write a program to reverse a string and remove character from index 4 to index 9 from
        the reversed string using String Buffer */


public class Solution8 {

    public static void main(String args[]){
        StringBuffer str = new StringBuffer("RahulSharmaToTheNew");
        str.reverse();

        System.out.println("String before change is :"+str);

    str.delete(4,9);              //Using delete function.

  //      str.replace(4,9,"");                                          //Usinf replace method
        System.out.println("String after change is "+str);

    }



}
