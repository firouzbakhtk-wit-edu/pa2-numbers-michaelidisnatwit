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
	}

}
