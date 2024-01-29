package finalkeyword;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Great Gatsby");

        String title = book.bookTitle;
        System.out.println("Book Title: " + title);

        book.displayBookDetails();
    }
}
