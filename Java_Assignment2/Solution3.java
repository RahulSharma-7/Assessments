
//3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

package com.company;

public class Solution3 {

public static void main(String args[]){

    try
    {
        Class.forName("Solution19");
    }
    catch (ClassNotFoundException e)
    {

        e.printStackTrace();

    }
    catch (NoClassDefFoundError ef){
        ef.printStackTrace();
    }


}
}
