import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFromList {

    public static void main(String args[])
    {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,910,30);
       List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList);

    }
}
