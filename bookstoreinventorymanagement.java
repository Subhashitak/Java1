import java.util.Scanner;

// Book class definition
class Book {
    // Fields for book details
    private String title;
    private String author;
    private double price;
    private int numberOfCopies;

    // Method to get book details from the user
    public void getBookDetails(Scanner scanner) {
        System.out.print("Enter book title: ");
        this.title = scanner.nextLine();

        System.out.print("Enter book author: ");
        this.author = scanner.nextLine();

        System.out.print("Enter book price: ");
        this.price = scanner.nextDouble();

        System.out.print("Enter number of copies: ");
        this.numberOfCopies = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Book Price: " + this.price);
        System.out.println("Number of Copies: " + this.numberOfCopies);
    }
}

// Main class definition
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store three Book objects
        Book[] books = new Book[3];

        // Loop to get details for each book
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            books[i] = new Book(); // Create a new Book object
            books[i].getBookDetails(scanner); // Get details from user
        }

        // Display details of all books
        System.out.println("\nBooks in the inventory:");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println(); // New line for readability
        }

        // Close the scanner
        scanner.close();
    }
}
