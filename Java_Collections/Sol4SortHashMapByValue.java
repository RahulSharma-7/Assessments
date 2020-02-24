import java.util.*;

public class Sol4SortHashMapByValue {


    public static void main(String args[]){

        Map<String,Integer> map = new HashMap<String , Integer>();


        map.put("Sam",3);
        map.put("mathew",0);
        map.put("nick",1);
        map.put("max",2);
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(map.entrySet());

        System.out.println(map);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                return stringIntegerEntry.getValue().compareTo(t1.getValue());
            }
        });
System.out.println(list);

        System.out.println("The value after sorting is "+list);




    }


}
