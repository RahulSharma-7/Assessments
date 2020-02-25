

@FunctionalInterface
interface Addition
{
    public int add(int a, int b);
}

@FunctionalInterface
interface Substract
{
    public int subst(int a,int b);
}

interface Multiplication
{
    public static int multiply(int a, int b)
    {
        return a*b;
    }
}
public class InstanceStaticFunInterface {

        public static void main(String args[]){

            Addition addition = (a,b)->a+b;
            Substract substract =(a,b)->a-b;

            System.out.println(addition.add(4,5));
            System.out.println(substract.subst(5,4));
            System.out.println(Multiplication.multiply(5,4));

        }

}
