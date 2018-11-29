package lv.danilsgrics.eighthLab;

import java.util.Objects;

public class Book {

    private String author;
    private String title;

    Book(String author, String title) {

        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        return "\nAuthor: " + author + ", title: " + title;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Book that = (Book) o;

        return Objects.equals(author, that.author) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return author.hashCode() + title.hashCode();
    }
}
