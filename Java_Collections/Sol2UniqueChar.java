import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sol2UniqueChar {


    public static void main(String args[]) {

        String s = "This is a string ";

        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                list.add(s.charAt(i));
            }

        }

        Collections.sort(list);
        System.out.println(list);
        int count = 1;
        for (int i = 0; i < list.size() ; i++) {

            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) != list.get(j)) {

                    System.out.println(list.get(i) + " occurs " + count + " times");
                    i=j;
                    count=1;

                } else {
                    count++;
                }
            }

        }
    }
}