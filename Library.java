import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Display all books in the library
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    // Search for a book by title
    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                found = true;
                break; // Stop searching after finding the first match
            }
        }
        if (!found) {
            System.out.println("Book not found with title: " + title);
        }
    }
    // Search for a book by title
    public void searchBookByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                found = true;
                break; // Stop searching after finding the first match
            }
        }
        if (!found) {
            System.out.println("Book not found with author: " +author);
        }
    }
     // Search for a book by isbn
    public void searchBookByISBN(String isbn) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(isbn)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                found = true;
                break; // Stop searching after finding the first match
            }
        }
        if (!found) {
            System.out.println("Book not found with isbn: " + isbn);
        }
    }


    // Other methods to manipulate the ArrayList as needed
}

    

