package Studtopedia;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the upper limit
        System.out.print("Enter a positive integer as the upper limit: ");
        int limit = scanner.nextInt();

        // Validate input
        if (limit < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the first two Fibonacci numbers
            int a = 0, b = 1;

            System.out.println("Fibonacci sequence up to " + limit + ":");

            // Generate the Fibonacci sequence
            while (a <= limit) {
                System.out.print(a + " ");
                int next = a + b; // Calculate the next Fibonacci number
                a = b;            // Update a to the next number
                b = next;        // Update b to the next number
            }
        }

        // Close the scanner
        scanner.close();
    }
}
