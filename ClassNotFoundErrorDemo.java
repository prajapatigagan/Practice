package Exception;

public class ClassNotFoundErrorDemo {
    public static void main(String[] args) {
        String className = "com.nonexistent.MyDatabaseDriver";
        try {
            // Attempting to load a class that does not exist
            // on the classpath at runtime.
            Class.forName(className);
            System.out.println("Class loaded successfully!");
        } catch (ClassNotFoundException e) {
            // The exception is caught here because the JVM couldn't locate the .class file
            System.err.println("--- ClassNotFoundException Caught ---");
            System.err.println("Error loading class: " + className);
            System.err.println("Message: " + e.getMessage());
            System.err.println("Check if the required JAR file is included in your project's classpath.");
        }
    }
}
