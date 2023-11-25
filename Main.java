import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Library");
        System.out.println("Please read carefully these these points");
        System.out.println("Press 1 to add book");
        System.out.println("Press 5 to get all book present in library");
        System.out.println("Press 2 to get book by author name");
        System.out.println("Press 7 to get book by ISBN number");
        Library library = new Library();
        int inpu = sc.nextInt();
        if (inpu == 1) {
            System.out.println("Enter book title");
            String title = sc.nextLine();
            System.out.println("Enter book ISBN number only 5 digits");
            String ISBN = sc.nextLine();
            System.out.println("Enter author name");
            String author = sc.nextLine();

            Book book = new Book(title, ISBN, author);
            library.addBook(book);

        } else if (inpu == 2) {
            System.out.println("Enter author name");
            String author2 = sc.nextLine();
            library.searchBookByAuthor(author2);

        } else if (inpu == 5) {
            library.displayAllBooks();
            System.out.println("Happy reading ");

        } else if (inpu == 7) {
            System.out.println("Please enter ISBN number it consists only number of 5 digits");
            String ISBN2 = sc.nextLine();

            library.searchBookByISBN(ISBN2);

        } else {
            System.out.println("Sorry mis match input check again");

        }

    }
}