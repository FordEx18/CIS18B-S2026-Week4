package edu.norcocollege.cis18b.weekx.mini01;

public class BuiltInExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        String[] alerts = {"CPU High", "Disk Full", "Login Failure"};
        // TODO: Use try/catch to handle division by zero.
        try{
            int result = numerator / denominator;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        // TODO: Use try/catch to handle an invalid alert index.
        try{
            String alert = alerts[3]; // Trigger ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid alert index.");
        }
        System.out.println("Program completed.");
    }
}
