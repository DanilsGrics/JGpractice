package lv.danilsgrics.eighthLab;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public void addBook(String author, String title) {

        if (!books.contains(new Book(author, title))) {

            books.add(new Book(author, title));
            System.out.println("Book added successfully!");
        }
    }

    public void deleteBook(String author, String title) {

        if (books.contains(new Book(author, title))) {

            books.remove(new Book(author, title));
            System.out.println("Book removed successfully!");
        }
    }

    public Book getBookByTitle(String title) {

        for (Book book : books) {

            if (book.getTitle().equals(title)) {

                System.out.println(book);
                return book;
            }
        }

        return null;
    }

    public List getAllBooksByAuthor(String author) {

        List<Book> booksByAuthor = new ArrayList<>();

        for (Book book : books) {

            if (book.getAuthor().equals(author)) {

                booksByAuthor.add(book);
            }
        }

        System.out.println(booksByAuthor);
        return booksByAuthor;
    }

    @Override
    public String toString() {

        return "" + books;
    }
}
