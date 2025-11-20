package Exception;

public class NumberFormatExceptio extends Throwable {
    public static void main(String[] args) {

        // 1. String that cannot be parsed as an integer
        String badIntString = "123a";
try {
    // 2. Attempt to convert the invalid string to an integer
    // This operation throws the NumberFormatException
    int number = Integer.parseInt(badIntString);

    System.out.println("Parsed number: " + number);
}
// Unreached code
catch (NumberFormatException e) {
    // 3. Catch the exception
    System.err.println("--- NumberFormatException Caught ---");
    System.err.println("Error parsing string: '" + badIntString + "'");
    System.err.println("Message: " + e.getMessage());
    System.err.println("Cause: The string contains characters that are not valid digits for an integer.");
}
    }

    }
