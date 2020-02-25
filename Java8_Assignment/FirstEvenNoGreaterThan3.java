import java.util.Arrays;
import java.util.List;

public class FirstEvenNoGreaterThan3 {


    public static void main(String args[])
    {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);


        System.out.println(list.stream().filter(i->i>3).filter(e->e%2==0).findFirst());








    }




}
