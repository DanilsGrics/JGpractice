package lv.danilsgrics.eighthLab;

public class LibraryTest {

    public static void main(String[] args) {

        Book book1 = new Book("Marcel Proust", "In Search of Lost Time");
        Book book2 = new Book("Marcel Proust", "Swann's Way");
        Book book3 = new Book("Marcel Proust", "Swann's Way");
        Book book4 = new Book("Miguel de Cervantes", "Don Quixote");
        Book book5 = new Book("James Joyce", "Ulysses");
        Library library = new Library();

        System.out.println(library);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        System.out.println(library);
        library.getAllBooksByAuthor("Marcel Proust");
        library.getBookByTitle("Don Quixote");
        library.deleteBook(book1);
        System.out.println(library);
    }
}
