package Studtopedia;

class Point {
    // Attributes
    private int x;
    private int y;

    // Constructor to initialize point
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Method to display point details
    public void displayDetails() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class PointTest {
    public static void main(String[] args) {
        // Creating a Point object
        Point point1 = new Point(5, 10);
        point1.displayDetails();

        // Creating a Point object using the copy constructor
        Point point2 = new Point(point1);
        point2.displayDetails();
    }
}

