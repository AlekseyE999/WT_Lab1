package by.bsuir.tasks.task12_15;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
 
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && title.equals(book.title) && author.equals(book.author) && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Книга: заголовок " + title + ", автор " + author + ", цена " + price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book book) {
        if (book == null)
            return 1;
        return isbn.compareTo(book.isbn);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
