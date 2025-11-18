package Exception;

public class ArrayErrorDemo {
    public static void main(String[] args) {
        // 1. Declare and initialize an array of size 3
        int[] numbers = {10, 20, 30};

        System.out.println("Array length: " + numbers.length); // Output: 3

        try {
            // 2. Attempt to access an element at index 3
            // The last valid index is 2 (3 - 1). Index 3 is out of bounds.
            int element = numbers[3];
            System.out.println("This will not print: " + element);

        } catch (ArrayIndexOutOfBoundsException e) {
            // 3. The exception is caught here
            System.err.println("--- Exception Caught ---");
            System.err.println("Error: " + e.getMessage());
            System.err.println("The program tried to access a location that doesn't exist in the array.");
        }
    }
}
