package Exception;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            // Attempt to open a file for reading
            File file = new File("some_data.txt");
            FileReader reader = new FileReader(file);

            // Assume processing the file content might lead to other IO issues
            // For simplicity, we just close it.
            reader.close();

        } catch (FileNotFoundException e) {
            // 1. Specific handling for the case where the file is missing
            System.err.println("❌ ERROR: File was not found! Please check the path.");
            System.err.println("Details: " + e.getMessage());

        } catch (IOException e) {
            // 2. Handling for any other general I/O problem (e.g., file permission or disk error)
            System.err.println("⚠️ WARNING: A general I/O error occurred during operation.");
            System.err.println("Details: " + e.getMessage());

        } catch (Exception e) {
            // 3. Catch-all block for any other unexpected, non-IO errors
            System.err.println("🛑 CRITICAL: An unexpected error occurred.");

        } finally {
            System.out.println("\nExecution finished.");
        }
    }
}