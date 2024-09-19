package Studtopedia;

class Employee {
    // Attributes
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    // Additional attribute for Manager
    private double bonus;

    // Constructor
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary); // Call to parent constructor
        this.bonus = bonus;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Display employee details
        System.out.println("Bonus: $" + bonus);
        System.out.println("---------------------------");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Create Employee and Manager objects
        Employee emp = new Employee("Amit", 101, 50000);
        Manager mgr = new Manager("Kapil", 102, 70000, 5000);

        // Display their details
        emp.displayDetails();
        mgr.displayDetails();
    }
}

