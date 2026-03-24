package edu.norcocollege.cis18b.weekx.mini02;

public class FinallyDemo {
    public static void main(String[] args) {
        // TODO: Print "Opening alert stream..."
        System.out.println("Opening alert stream...");
        try {
            // TODO: Intentionally throw a RuntimeException with a helpful message.
            throw new RuntimeException("An error occurred while processing the alert.");
        } catch (RuntimeException ex) {
            // TODO: Print the error message in a friendly format.
            System.out.println("Error: " + ex.getMessage());
        } finally {
            // TODO: Print "Closing alert stream..."
            System.out.println("Closing alert stream...");
        }
    }
}
