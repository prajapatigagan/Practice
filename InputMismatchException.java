package Exception;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        // 1. Create a Scanner object to read input from the console

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter a whole number (integer): ");
            // 2. Attempt to read an integer
            // If the user types "hello" instead of "10", this line throws the exception.
            int number = scanner.nextInt();

            System.out.println("You successfully entered the number: " + number);

        } catch (java.util.InputMismatchException e) {
            // 3. Catch the exception
            System.err.println("--- InputMismatchException Caught ---");
            System.err.println("Error: You entered an incorrect data type.");
            System.err.println("The program expected an integer but received something else.");

        }
        // Always close the scanner to release system resources
    }
}