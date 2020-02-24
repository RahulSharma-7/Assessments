import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sol1DoubleList {





        public static void main(String[] args) {


            List<Double> list = new ArrayList<Double>();

            list.add(12.5);
            list.add(10.5);
            list.add(11.0);
            list.add(10.5);
            list.add(10.5);

            System.out.println(list);
    Double sum=0d;

            Iterator<Double> iterate = list.iterator();

            while(iterate.hasNext()){

                sum+=iterate.next();

            }


            System.out.println("The sum is "+sum);
        }

}


