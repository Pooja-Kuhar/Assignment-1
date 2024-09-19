package Studtopedia;

class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Constructor with title only
    public Book(String title) {
        this.title = title;
        this.author = "Godan";
        this.price = 0.0;
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with all attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---------------------------");
    }
}

public class BookTest {
    public static void main(String[] args) {
        // Creating Book objects using different constructors
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Book book3 = new Book("Clean Code", "Robert C. Martin", 29.99);

        // Displaying book details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}

