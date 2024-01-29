package finalkeyword;

public class Book {
    // Final instance variable in the final class
    final String bookTitle;

    // Constructor to initialize the final variable
    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // Final method to display book details
    final void displayBookDetails() {
        System.out.println("Book Title: " + bookTitle);
        // Additional book details can be displayed here
    }
}
