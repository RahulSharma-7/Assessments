

interface Book

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


class BookItem implements Book
{

    public static int pages=100;
    public void publisher()
    {
        Book.bookPublisher();
    }
}


public class DefautStaticMethod {

public static void main(String args[])
{
    BookItem bookItem = new BookItem();

    bookItem.publisher();
    bookItem.language();
    System.out.println( BookItem.pages);



}

}
