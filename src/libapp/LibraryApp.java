package libapp;


import java.util.ArrayList;



public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for books with ISBN: %s\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getGenre(), book.getAuthor());
        } else {
            System.out.printf("0 book not found.");
        }
        System.out.println("\n\n");
    }

    public void searchByTitle(String keyword) {
        System.out.printf("Searching for books with title: '%s' in the title...\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s book found%s\n", books.size(), books.size() > 0 ? ":" : ".");
        for (Book book : books) {
            System.out.printf("\tTitle: %\n\tGenre: %s\n\tAuthor: %s\n\t----\n", book.getTitle(), book.getGenre());
        }
        System.out.println();

    }

    public void checkOutBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkOut()) {
                System.out.println("Checked out SUCCESSFUL");
                System.out.printf("\tISBN: %s\n\tAuthor: %s\n", book.getIsbn(), book.getTitle(), book.getAuthor());
            } else {
                System.out.println("Failed to check out book.\n");
                System.out.printf("Reason: There is no book with ISBN %s on record.\n", isbn);
            }

        }
    }

    public void checkInBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            book.checkIn();
            System.out.println("Book checked in successfully:");
            System.out.printf("\tISBN: %s\n\tAuthor: %s\n", book.getIsbn(), book.getTitle(), book.getAuthor());
        } else {
            System.out.printf("Failed to check in book.\n");
            System.out.printf("Reason: There is no book with ISBN %s on record.\n", isbn);
        }

    }

}