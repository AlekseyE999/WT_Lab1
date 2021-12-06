package by.bsuir.tasks.task12_15.Comporator;

import by.bsuir.tasks.task12_15.Book;
import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1 == null || o2 == null)
            throw new IllegalArgumentException();
        else
            return o1.getTitle().compareTo(o2.getTitle());
    }
}
