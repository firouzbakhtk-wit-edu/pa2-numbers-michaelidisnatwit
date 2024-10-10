package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sumPositive =0, sumNonPositive =0, sumAll = 0;
		int countPositive = 0, countNonPositive = 0;
		
		//Asks user for input
		System.out.println("Enter five whole numbers");
		
		// Gets five numbers from user
		for (int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			
			// Add to some of all the whole numbers
			sumAll += num;
			
			// Checks if number is positive or negative 
			if (num > 0) {
				sumPositive += num;
				countPositive++;
			} else {
				sumNonPositive += num;
				countNonPositive++;
			}
		}
				
				// calculates 
				double avgPositive = (countPositive > 0) ? (double) sumPositive / countPositive : 0.0;
				double avgNonPositive = (countNonPositive > 0) ? (double) sumNonPositive / countNonPositive : 0.0;
				double avgAll = (double) sumAll / 5;
				
				//Outputs the results
				System.out.printf("The sum of the %d positive numbers: %d%n", countPositive, sumPositive);
				System.out.printf("The sum of the non-positive numbers: %d%n", countNonPositive, sumNonPositive);
				System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
				System.out.printf("The average of the %d positive numbers: %.2f%n", countPositive, avgPositive);
				System.out.printf("The average of the %d non-positive numbers: %.2f%n", countNonPositive, avgNonPositive);
				System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
				
				scanner.close();
			}
	}
