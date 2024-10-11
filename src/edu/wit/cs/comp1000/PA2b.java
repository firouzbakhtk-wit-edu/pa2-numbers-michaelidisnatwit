package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a b c: ");  // Ensure one space after the colon

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        // Print roots based on discriminant
        if (discriminant < 0) {
            // Roots are imaginary
            System.out.println("Roots: imaginary");  // Ensure proper newline
        } else if (discriminant == 0) {
            // One real root (use "Root" for singular)
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);  // Singular form
        } else {
            // Two real roots
            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            
            // Ensure root1 is smaller than root2
            if (root1 > root2) {
                double temp = root1;
                root1 = root2;
                root2 = temp;
            }

            // Print the roots in ascending order (use "Roots" for plural)
            System.out.printf("Roots: %.2f, %.2f%n", root1, root2);  // Plural form
        }

        // Close the scanner
        scanner.close();
    }
}



