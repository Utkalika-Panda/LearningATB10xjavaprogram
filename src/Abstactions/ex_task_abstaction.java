package Abstactions;

public class ex_task_abstaction {
    public static void main(String[] args) {
        PrintMyBook printbook = new PrintMyBook("Harry Potter","J.k. Rowling", 120);
        printbook.getDetails();
        PrintMyBook printbook1 = new PrintMyBook("Utkalika","panda", 500);
        printbook1.getDetails();
    }
}

class PrintMyBook extends Book{
    public PrintMyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name +""  +Author +"" + Price);
       /* System.out.println(Author);
        System.out.println(Price);*/

    }
}


abstract class Book{
    String name;
    String Author;
    double Price;

    public Book(String name_c, String author_c, double price_c) {
        this.name = name_c;
        this.Author = author_c;
        this.Price = price_c;
    }

    abstract void getDetails();



}


