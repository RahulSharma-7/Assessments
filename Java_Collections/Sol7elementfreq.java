//Print the elements of an array in the decreasing frequency
// if 2 numbers have same frequency then print the one which came first.

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class freq
{


    int value;
    int times=0;
    public freq(int value)
    {
        this.value=value;
    }



    public String toString()
    {
        return this.value+ " occurs "+ this.times+" times";
    }
}
public class Sol7elementfreq {
    public static void main(String args[])
    {

        List<freq> list = new ArrayList<freq>();

        list.add(new freq(1));
        list.add(new freq(1));



    System.out.println(list.get(0));
        System.out.println(list.get(1));





    }


}
