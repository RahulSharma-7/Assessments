public class Solution2 {

public static void main(String args[]){

   System.out.println("Hello !");

    String str="In the above code, we have two class Demo and Flavor1Demo. Here demo act as super class " +
            "and anonymous class acts as a subclass, both classes have a method show(). " +
            "In anonymous class show() method is overridden.";
    int l=str.length();
    String word = " class ";
int c,ind,i;

        String[] arr=str.split(" ");

                        for (int j=0;j<arr.length;j++){
                            c=0;
                            ind=0;
                            i=0;

                            word=arr[j];
                            while(i<l && ind!=-1) {


                                ind = str.indexOf(word, i);


                                if(ind!=-1){
                                    i = ind + 1;
                                    c++;

                                }
                            }
                                if(c>1) {
                                    System.out.println("The Word " + word + " occurs " + c + " times");

                                }


                        }


}
}
