package Studtopedia;

class Car {
    // Attributes
    private String brand;
    private String model;
    private double price;

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Audi";
        this.price = 8.0;
    }

    // Parameterized constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Price: $" + price);
        System.out.println("---------------------------");
    }
}

public class CarTest {
    public static void main(String[] args) {
        // Create a Car object using the default constructor
        Car defaultCar = new Car();
        defaultCar.displayDetails();

        // Create a Car object using the parameterized constructor
        Car parameterizedCar = new Car("Toyota", "Camry", 24000);
        parameterizedCar.displayDetails();
    }
}

