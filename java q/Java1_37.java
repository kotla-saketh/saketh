    //Write a program to calculate electricity charges based on usage.

import java.util.Scanner;
public class Java1_37 {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of units used
        System.out.print("Enter the number of units consumed: ");
        double units = sc.nextDouble();

        // Variable to store the total charges
        double totalCharges = 0.0;

        // Define rates for different usage ranges
        if (units <= 100) {
            totalCharges = units * 1.5;  // Rate for up to 100 units
        } else if (units <= 300) {
            totalCharges = 100 * 1.5 + (units - 100) * 3;  // Rate for 101-300 units
        } else {
            totalCharges = 100 * 1.5 + 200 * 3 + (units - 300) * 5;  // Rate for above 300 units
        }

        // Display the total charges
        System.out.println("Total electricity charges for " + units + " units: Rs. " + totalCharges);

        // Close the scanner
        sc.close();
    }
}
