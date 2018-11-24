package lv.danilsgrics.eighthLab;

public class LibraryTest {

    public static void main(String[] args) {

        Library library = new Library();

        System.out.println(library);

        library.addBook("Marcel Proust", "In Search of Lost Time");
        library.addBook("Marcel Proust", "Swann's Way");
        library.addBook("Marcel Proust", "Swann's Way");
        library.addBook("Miguel de Cervantes", "Don Quixote");
        library.addBook("James Joyce", "Ulysses");
        System.out.println(library);
        library.getAllBooksByAuthor("Marcel Proust");
        library.getBookByTitle("Don Quixote");
        library.deleteBook("Marcel Proust", "In Search of Lost Time");
        System.out.println(library);
    }
}
