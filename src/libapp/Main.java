package libapp;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.checkOutBook("06917");
        app.checkOutBook("72391");
//        app.searchByIsbn("83471");
    }
}