package task12_15.Comporator;

import task12_15.Book;
import java.util.Comparator;

public class AuthorComporator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1 == null || o2 == null)
            throw new IllegalArgumentException();
        else
            return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
