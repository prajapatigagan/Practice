package Exception;

public class NullPointerException extends Throwable {
    public static void main(String[] args) {

        // 1. Declare a String variable but DO NOT initialize it
        //    (or explicitly set it to null).
        String name = "rahul";

        // 2. Attempt to call a method (like length()) on the 'null' reference.
        // This is the operation that triggers the NullPointerException.
        int length = name.length();

        System.out.println("Name length: " + length); // This line is never reached

    }

}