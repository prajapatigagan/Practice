package Exception;

public class StringErrorDemo {
    public static void main(String[] args) {

        String word = "HELLO";

        System.out.println("String length: " + word.length()); // Output: 5

        // Valid indices are 0, 1, 2, 3, 4

        // 1. Trying to access a negative index
        try {
            char invalidChar = word.charAt(-1);
            System.out.println("Char at -1: " + invalidChar);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("\n--- StringIndexOutOfBoundsException (Negative Index) ---");
            System.err.println("Error: " + e.getMessage());
        }

        // 2. Trying to access an index equal to the length (length is 5, last index is 4)
        try {
            char invalidChar = word.charAt(5);
            System.out.println("Char at 5: " + invalidChar);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("\n--- StringIndexOutOfBoundsException (Index too large) ---");
            System.err.println("Error: " + e.getMessage());
        }
    }
}