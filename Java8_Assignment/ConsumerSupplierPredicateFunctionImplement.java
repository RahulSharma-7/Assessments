import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerSupplierPredicateFunctionImplement {


public static void main(String args[])
{
    List<Integer> list = Arrays.asList(1,2,4,3,5,10,15);

    Consumer<Integer> con = new Consumer<Integer>() {
        @Override
        public void accept(Integer integer) {
            System.out.println(integer*2);
        }
    };

list.forEach(con);

    System.out.println(list);
    Predicate<Integer> pr = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer%5==0;
        }
    };

    list.stream().filter(pr);







}

}
