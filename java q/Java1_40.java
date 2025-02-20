//Create a program to print "Pass" or "Fail" based on marks.
import java.util.Scanner;

public class Java1_40 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the marks
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Check if the marks are greater than or equal to the passing marks
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Close the scanner
        sc.close();
    }
}
