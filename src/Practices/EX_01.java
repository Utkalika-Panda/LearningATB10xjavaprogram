package Practices;

public class EX_01 {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 120);
        myBook.getDetails();
    }


}


class PrintMyBook extends Book{
    public PrintMyBook(String book_name, String book_Author_name, long book_price) {
        super(book_name, book_Author_name, book_price);
    }

    @Override
    void getDetails() {
        System.out.println(Book_name +", "+Book_Author_name+" ,"+Book_price);

    }
}
abstract class Book{
    String Book_name;
    String Book_Author_name;
    long   Book_price;

    public Book(String book_name, String book_Author_name, long book_price) {
        Book_name = book_name;
        Book_Author_name = book_Author_name;
        Book_price = book_price;
    }
    abstract void getDetails();
}
