import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbersGreaterThan5 {


public static void main(String args[])
{
    List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,9,8,76,67);


    List<Integer> numberGreater5 = list.stream().filter(i->i>5).collect(Collectors.toList());
    System.out.println(numberGreater5);
    System.out.println(numberGreater5.stream().reduce(0,Integer::sum));


}

}
