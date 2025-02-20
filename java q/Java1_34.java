import java.util.Scanner;

public class Java1_34 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Define the range
        int lowerBound = 10;
        int upperBound = 50;

        // Check if the number is within the specified range
        if (num >= lowerBound && num <= upperBound) {
            System.out.println(num + " is in the range between " + lowerBound + " and " + upperBound + ".");
        } else {
            System.out.println(num + " is not in the range between " + lowerBound + " and " + upperBound + ".");
        }

        // Close the scanner
        sc.close();
    }
}
