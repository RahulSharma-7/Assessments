import org.w3c.dom.ls.LSOutput;

interface Interface1
{
    public default void methodInInterface()
    {
        System.out.println("Hello from Interface1");
    }
}

interface Interface2
{
    public default void methodInInterface()
    {
        System.out.println("Method from Interface2");
    }
}
interface Interface3
{
    public  default void methodInInterface3()
    {
        System.out.println("Method from Interface3");
    }
}



class MultipleInheritance  implements  Interface1,Interface2,Interface3{
public static void main(String args[])
{

MultipleInheritance multipleInheritance = new MultipleInheritance();
multipleInheritance.methodInInterface3();
multipleInheritance.methodInInterface();
}
@Override
    public void methodInInterface(){
        System.out.println("Hello");
    }
}
