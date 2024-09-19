package Studtopedia;



	import java.util.Scanner;

	public class PrimeChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user for a number
	        System.out.print("Enter a positive integer: ");
	        int number = scanner.nextInt();

	        // Validate input
	        if (number <= 1) {
	            System.out.println(number + " is not a prime number.");
	        } else {
	            boolean isPrime = true; // Assume the number is prime

	            // Check for factors from 2 to the square root of the number
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false; // Found a factor, not prime
	                    break; // No need to check further
	                }
	            }

	            // Output the result
	            if (isPrime) {
	                System.out.println(number + " is a prime number.");
	            } else {
	                System.out.println(number + " is not a prime number.");
	            }
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}
