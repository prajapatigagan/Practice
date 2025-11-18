package Exception;

public class ArithmeticError {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            // The compiler allows this, but the JVM throws the exception at runtime.
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Caught an error: " + e.getMessage());
            // Output: Caught an error: / by zero
        }
    }
}
