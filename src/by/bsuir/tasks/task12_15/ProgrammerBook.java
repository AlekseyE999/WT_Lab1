package task12_15;

import java.util.Objects;

public class ProgrammerBook extends Book {
	
	private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() || !super.equals(o)) return false;
        ProgrammerBook prBook = (ProgrammerBook) o;
        return level == prBook.level && language.equals(prBook.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return " нига по программированию: заголовок " + getTitle() + ", автор " + getAuthor() + ", цена " +
                getPrice() + ", €зык " + language + ", уровень " + level;
    }

}
