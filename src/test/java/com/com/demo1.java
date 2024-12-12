package com.com;

public class demo1 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0; // This will cause an ArithmeticException

        try {
            // Risky code that may throw an exception
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException x) {
            // Handling the exception
            System.out.println("Exception caught: " + x.getMessage());
            System.out.println(x.getCause());
        } finally {
            // Code that will always execute
            System.out.println("Execution of finally block.");
        }

        System.out.println("Program continues...");
    }
}
