package week7.workshop;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    String title;
    String author;
    float price;

    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Book title";
        book.author = "Aryan";
        book.price = 33;

        Book book2 = new Book();
        book2.title = "Book title 2";
        book2.author = "A. Sethi";
        book2.price = 69;


        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);

        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);

    }
}