package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user input without newline
        System.out.print("Enter five whole numbers: "); // Space after colon
        
        int sumPositive = 0, sumNonPositive = 0, sumAll = 0;
        int countPositive = 0, countNonPositive = 0;

        // Loop to get five numbers
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            
            // Add to total sum
            sumAll += num;
            
            // Categorize as positive or non-positive
            if (num > 0) {
                sumPositive += num;
                countPositive++;
            } else {
                sumNonPositive += num;
                countNonPositive++;
            }
        }

        // Calculate averages
        double avgPositive = (countPositive > 0) ? (double) sumPositive / countPositive : 0.0;
        double avgNonPositive = (countNonPositive > 0) ? (double) sumNonPositive / countNonPositive : 0.0;
        double avgAll = (double) sumAll / 5;

        // Print results with singular/plural handling
        System.out.printf("The sum of the %d positive %s: %d%n", countPositive, (countPositive == 1) ? "number" : "numbers", sumPositive);
        System.out.printf("The sum of the %d non-positive %s: %d%n", countNonPositive, (countNonPositive == 1) ? "number" : "numbers", sumNonPositive);
        System.out.printf("The sum of the 5 numbers: %d%n", sumAll);
        System.out.printf("The average of the %d positive %s: %.2f%n", countPositive, (countPositive == 1) ? "number" : "numbers", avgPositive);
        System.out.printf("The average of the %d non-positive %s: %.2f%n", countNonPositive, (countNonPositive == 1) ? "number" : "numbers", avgNonPositive);
        System.out.printf("The average of the 5 numbers: %.2f%n", avgAll);
        
        scanner.close();
    }
}
