


interface BookInfo

{
    public static void bookPublisher()
    {
        System.out.println("Published by Penguine India");
    }


    public default void language()
    {
        System.out.println("The Language of the book is English");
    }


}

class BookItem1 implements BookInfo
{


    @Override
    public void language() {
        System.out.println("The Language of the Book is Sanskrit");
    }
}


public class OverridingDefaultMethod {


public static void main(String args[])

{
    BookItem1 bookItem1 = new BookItem1();
    bookItem1.language();

}

}
