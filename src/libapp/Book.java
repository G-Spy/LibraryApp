package libapp;

public class Book {
    private String isbn;
    private String title;
    private String genre;
    private String description;
    private String author;
    private int quantity;
    private int numCheckOut;

    public Book(String isbn, String title, String genre, String description, String author, int quantity, int numCheckOut) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.author = author;
        this.quantity = quantity;
        this.numCheckOut = numCheckOut;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getNumCheckOut() {
        return numCheckOut;
    }

    public boolean checkOut(){
        int quantity1 = quantity;
        if (numCheckOut >= quantity){
            return false;
        }
        numCheckOut++;
        return true;
    }
    public boolean checkIn(){
        if (numCheckOut <= 0) {
            return false;
        }
        numCheckOut--;
        return true;
    }
}
