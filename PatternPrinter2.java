package Studtopedia;

public class PatternPrinter2 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j+""); // Print numbers
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
