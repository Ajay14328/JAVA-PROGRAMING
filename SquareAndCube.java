import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        float number = scanner.nextFloat();

        // Calculate square and cube
        float square = number * number;
        float cube = number * number * number;

        // Display the results
        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Cube of " + number + " is: " + cube);

        // Close the scanner
        scanner.close();
    }
}