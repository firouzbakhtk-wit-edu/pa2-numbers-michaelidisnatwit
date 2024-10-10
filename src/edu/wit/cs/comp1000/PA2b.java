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
		}
	}

}
