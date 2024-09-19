package Studtopedia;

class Student {
    // Attributes
    private String name;
    private int age;
    private char grade;

    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");
    }
}

public class Studentdetails {
    public static void main(String[] args) {
        // Creating multiple Student objects
        Student student1 = new Student("komal", 20, 'A');
        Student student2 = new Student("Priya", 21, 'B');
        Student student3 = new Student("Rahul", 22, 'C');

        // Displaying details of each student
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}

