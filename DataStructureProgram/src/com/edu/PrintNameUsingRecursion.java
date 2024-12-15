package com.edu;

public class PrintNameUsingRecursion {

    // Recursive method to print a name 10 times
    private static void printName(String name, int count) {
        if (count == 0) {
            return; 
        }
        System.out.println(name); // Print the name
        printName(name, count - 1); 
    }

    public static void main(String[] args) {
       int n=10;
       String name="Gitanjali";

        // Calling the printName method to print name 10 times
        System.out.println("\nPrinting name 10 times:");
        printName(name, n); 
    }
}