package Exception;

import java.io.IOException;
import java.io.InputStream;

public class IOExceptionDemo {

    // Custom class to simulate a stream that fails on close
    static class FailingInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            return -1; // End of stream
        }

        @Override
        public void close() throws IOException {
            // Intentionally throw a generic IOException to simulate a failure
            throw new IOException("Simulated error: Disk write buffer failure during close.");
        }
    }

    public static void main(String[] args) {
        FailingInputStream stream = null;
        try {
            stream = new FailingInputStream();
            System.out.println("Stream initialized. Data read attempt...");
            stream.read(); // Read operation

        } catch (IOException e) {
            // Catches any IOException from initialization or read()
            System.err.println("Initial IO operation failed: " + e.getMessage());

        } finally {
            // The finally block attempts to close the resource
            if (stream != null) {
                try {
                    stream.close(); // This is the line that will throw the IOException
                } catch (IOException e) {
                    // We must handle the IOException that the close() method throws
                    System.err.println("\n--- IOException Caught in Finally Block ---");
                    System.err.println("Error closing resource: " + e.getMessage());
                }
            }
        }
    }
}
