public class Book {
    private String title;
    private String ISBN;
    private String author;
    private boolean available; // Indicates whether the book is available for borrowing
    public Book(String title,String ISBN,String author){
        this.title = title;
        this.ISBN = ISBN;
        this.author= author;
        this.available = true;

    }
   
      // Getters
      public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
      public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters (optional, depending on your requirements)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Other methods related to Book class (optional)
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
}

