


@FunctionalInterface
interface InterfaceCustom
{
    public int customInterface(int a,int b);
}

public class Sol2FunctionalInterface {


    public static void main(String args[])
    {
        InterfaceCustom interfaceCustom = (a,b)->a+b;
        System.out.println(interfaceCustom.customInterface(5,4));
    }
}
