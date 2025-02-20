import java.util.Scanner;

public class Java1_38 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Categorize the person based on their age
        if (age >= 0 && age <= 12) {
            System.out.println("You are a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age >= 20 && age <= 35) {
            System.out.println("You are a Young Adult.");
        } else if (age >= 36 && age <= 60) {
            System.out.println("You are an Adult.");
        } else if (age > 60) {
            System.out.println("You are a Senior.");
        } else {
            System.out.println("Invalid age entered.");
        }

        // Close the scanner
        sc.close();
    }
}

