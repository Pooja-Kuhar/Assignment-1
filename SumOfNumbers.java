package Studtopedia;
import java.util.Scanner;


	public class SumOfNumbers {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for the value of n
	        System.out.print("Enter a positive integer (n): ");
	        int n = scanner.nextInt();

	        // Validate input
	        if (n < 1) {
	            System.out.println("Please enter a positive integer greater than 0.");
	        } else {
	            int sum = 0;

	            // Calculate the sum of the first n natural numbers
	            for (int i = 1; i <= n; i++) {
	                sum += i; // Add i to sum
	            }

	            // Output the result
	            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	

	}


