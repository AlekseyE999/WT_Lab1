package task12_15.Comporator;

import task12_15.Book;
import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1 == null || o2 == null)
            throw new IllegalArgumentException();
        else
            return Integer.compare(o1.getPrice(),o2.getPrice());
    }
}
