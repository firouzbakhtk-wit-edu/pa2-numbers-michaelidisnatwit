package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2b {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Asks user for input
		System.out.println("Enter a b c:");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		//Calculates discriminant
		double discriminant = b * b - 4 * a * c;
		
		// handles cases based on the discriminant
		if (discriminant < 0) {
			System.out.println("Root: imaginary");
		} else if (discriminant == 0) {
			
			// one real root
			double root = -b / (2 * a);
			System.out.printf("Root: %.2f%n", root);
		} else {
			
			// Two real roots
			double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
			
			// Ensures the roots are printed in the correct order
			if (root1 > root2) {
				double temp = root1;
				root1 = root2;
				root2 = temp;
			}
			
			// Print the roots
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}

    scanner.close();
	}
}
