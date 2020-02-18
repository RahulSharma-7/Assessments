public class Solution3 {
    public static void main(String args[]) {


        String s = "This is a string that is solely being generated for the purpose of experimenting the index of function";

    int org_length=s.length();
            String str=s.replace("a","");

            int temp_length=str.length();

            int occurences=org_length-temp_length;

            System.out.println("The word occurs "+occurences+" times");


    }



}
