import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DoublingListAverage {

    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);


      //  System.out.println(list.stream().map(i->i*2).collect(List<Integer>=Arrays.a));
        System.out.println(list);
        System.out.println(list.stream().map(i->i*2).reduce(0,Integer::sum));
        System.out.println(list.stream().map(i->i*2).mapToInt(i->i).average());



    }
}
