

    //First no is greater than the second

@FunctionalInterface
interface GreaterNoInterface{
    public  boolean greaterNumber(int a,int b);}

    @FunctionalInterface
    interface IncrementByOne{

    public int increment(int n);
    }

@FunctionalInterface
interface ConcatTwoString{

    public String concat(String s1,String s2);

}
@FunctionalInterface
interface ToUpperCase
{
    public String toUpperCase(String s);
}



public class LambdaImplementation {

    public static void main(String args[])
    {

        GreaterNoInterface greaterNoInterface = (a,b) -> (a>b);
        System.out.println(greaterNoInterface.greaterNumber(3,4));
        IncrementByOne incrementByOne =(n)->n+1;
        System.out.println(incrementByOne.increment(3));

        ConcatTwoString concatTwoString = (s1,s2)->s1+s2;
        System.out.println(concatTwoString.concat("Rahul","Sharma"));

        ToUpperCase toUpperCase = (s1)->s1.toUpperCase();
        System.out.println(toUpperCase.toUpperCase("RAHUL"));


    }
}
